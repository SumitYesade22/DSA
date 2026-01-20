class Solution:
    def countPaths(self, grid: List[List[int]]) -> int:
        MOD = 10**9 + 7
        h, v = len(grid), len(grid[0])
        dp = [[-1]*v for _ in range(h)]

        def dfs(i, j):
            if dp[i][j] != -1:
                return dp[i][j]

            ways = 1  

            for di, dj in [(1,0), (-1,0), (0,1), (0,-1)]:
                ni, nj = i + di, j + dj
                if 0 <= ni < h and 0 <= nj < v and grid[ni][nj] > grid[i][j]:
                    ways += dfs(ni, nj)

            dp[i][j] = ways % MOD
            return dp[i][j]

        ans = 0
        for i in range(h):
            for j in range(v):
                ans = (ans + dfs(i, j)) % MOD

        return ans