class Solution:
    def containsCycle(self, grid: list[list[str]]) -> bool:
        m, n = len(grid), len(grid[0])
        visited = [[False] * n for _ in range(m)]
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        def cycleDetectDFS(r: int, c: int, prev_r: int, prev_c: int) -> bool:
            # If already visited, a cycle is detected
            if visited[r][c]:
                return True
            
            visited[r][c] = True

            # Explore all 4 neighbors
            for dr, dc in directions:
                new_r, new_c = r + dr, c + dc

                # Check boundaries and matching characters
                if 0 <= new_r < m and 0 <= new_c < n and grid[new_r][new_c] == grid[r][c]:
                    # Avoid moving backward immediately to the parent cell
                    if new_r == prev_r and new_c == prev_c:
                        continue
                    
                    if cycleDetectDFS(new_r, new_c, r, c):
                        return True
            
            return False

        # Traverse the entire 2D grid
        for i in range(m):
            for j in range(n):
                if not visited[i][j]:
                    # Start DFS passing current cell as its own parent initially
                    if cycleDetectDFS(i, j, i, j):
                        return True
                        
        return False
