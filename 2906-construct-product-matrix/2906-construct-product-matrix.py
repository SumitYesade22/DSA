class Solution:
    def constructProductMatrix(self, grid: list[list[int]]) -> list[list[int]]:
        MOD = 12345
        n = len(grid)
        m = len(grid[0])

        # Result matrix p ko initialize kiya 0 se
        p = [[0] * m for _ in range(n)]

        # Step 1: Suffix Products (Peeche se aage loop)
        suffix = 1
        for i in range(n - 1, -1, -1):
            for j in range(m - 1, -1, -1):
                p[i][j] = suffix
                suffix = (suffix * grid[i][j]) % MOD

        # Step 2: Prefix Products (Aage se peeche loop)
        prefix = 1
        for i in range(n):
            for j in range(m):
                p[i][j] = (prefix * p[i][j]) % MOD
                prefix = (prefix * grid[i][j]) % MOD

        return p
