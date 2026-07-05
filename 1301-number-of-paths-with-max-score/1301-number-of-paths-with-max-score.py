class Solution:
    def pathsWithMaxScore(self, board: list[str]) -> list[int]:
        n = len(board)
        MOD = 10**9 + 7
        
        # Simple 2D matrices for memoization initialized to -1
        memo_score = [[-1] * n for _ in range(n)]
        memo_paths = [[-1] * n for _ in range(n)]

        def solve(i, j):
            # Base Case 1: Out of bounds or stepping on an obstacle 'X'
            if i < 0 or i >= n or j < 0 or j >= n or board[i][j] == 'X':
                return 0, 0
                
            # Base Case 2: Reached the destination 'E'
            if board[i][j] == 'E':
                return 0, 1

            # Check if this state is already calculated
            if memo_score[i][j] != -1:
                return memo_score[i][j], memo_paths[i][j]

            # Calculate current numerical value if it is a digit
            current_val = 0
            if board[i][j] != 'S':
                current_val = int(board[i][j])

            # Recurse in 3 directions: Up, Left, and Diagonal Up-Left
            up_score, up_paths = solve(i - 1, j)
            left_score, left_paths = solve(i, j - 1)
            diag_score, diag_paths = solve(i - 1, j - 1)

            # Only add current cell's value if a valid path exists from that direction
            if up_paths > 0:    up_score += current_val
            if left_paths > 0:  left_score += current_val
            if diag_paths > 0:  diag_score += current_val

            # Find the absolute maximum score among the choices
            max_score = max(up_score, left_score, diag_score)
            total_paths = 0

            # Collect paths from all paths matching the maximum score
            if max_score == up_score:
                total_paths = (total_paths + up_paths) % MOD
            if max_score == left_score:
                total_paths = (total_paths + left_paths) % MOD
            if max_score == diag_score:
                total_paths = (total_paths + diag_paths) % MOD

            # If no paths successfully reached the target, reset max score to 0
            if total_paths == 0:
                max_score = 0

            # Store the calculations in our memo arrays
            memo_score[i][j] = max_score
            memo_paths[i][j] = total_paths

            return max_score, total_paths

        # Start from the bottom-right corner 'S' at (n-1, n-1)
        ans_score, ans_paths = solve(n - 1, n - 1)
        return [ans_score, ans_paths]
