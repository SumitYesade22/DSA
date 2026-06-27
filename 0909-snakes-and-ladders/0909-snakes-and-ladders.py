class Solution:
    def snakesAndLadders(self, board: List[List[int]]) -> int:
        n = len(board)
        
        # Converts cell number to board coordinates considering the zigzag pattern
        def get_coord(s: int) -> tuple[int, int]:
            row = n - 1 - (s - 1) // n
            col = (s - 1) % n
            
            # If the row has a reversed (right-to-left) direction
            if (n % 2 == 1 and row % 2 == 1) or (n % 2 == 0 and row % 2 == 0):
                col = n - 1 - col
                
            return row, col

        # BFS initialization
        queue = deque([1])  # Start from cell 1
        visited = [[False] * n for _ in range(n)]
        visited[n - 1][0] = True
        steps = 0

        while queue:
            level_size = len(queue)
            
            for _ in range(level_size):
                curr = queue.popleft()
                
                # Reached the final destination cell
                if curr == n * n:
                    return steps
                
                # Roll a 6-sided die
                for dice in range(1, 7):
                    next_cell = curr + dice
                    if next_cell > n * n:
                        break
                        
                    r, c = get_coord(next_cell)
                    
                    if visited[r][c]:
                        continue
                    visited[r][c] = True
                    
                    # If there is a snake or a ladder, move to its destination
                    if board[r][c] == -1:
                        queue.append(next_cell)
                    else:
                        queue.append(board[r][c])
            
            steps += 1
            
        return -1
        