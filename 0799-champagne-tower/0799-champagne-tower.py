class Solution:
    def champagneTower(self, poured: int, query_row: int, query_glass: int) -> float:
        self.dp = [[-1.0]*101 for _ in range(101)]
        return min(1.0, self.solve(poured, query_row, query_glass))
    def solve(self, poured, i, j):
        if i < 0 or j < 0 or j > i:
            return 0.0
        
        if i == 0 and j == 0:
            self.dp[i][j] = poured
            return poured

        if self.dp[i][j] != -1:
            return self.dp[i][j]

        up_left = (self.solve(poured, i-1, j-1) - 1) / 2.0
        up_right = (self.solve(poured, i-1, j) - 1) / 2.0

        if up_left < 0:
            up_left = 0.0
        if up_right < 0:
            up_right = 0.0

        self.dp[i][j] = up_left + up_right
        return self.dp[i][j]
        