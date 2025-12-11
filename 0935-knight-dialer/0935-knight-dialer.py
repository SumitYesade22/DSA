class Solution:
    MOD = 10**9 + 7

    # Adjacency list for each digit (knight moves)
    adj = {
        0: [4, 6],
        1: [6, 8],
        2: [7, 9],
        3: [4, 8],
        4: [3, 9, 0],
        5: [],
        6: [1, 7, 0],
        7: [2, 6],
        8: [1, 3],
        9: [2, 4]
    }

    def knightDialer(self, n: int) -> int:
        # dp[n][digit]
        dp = [[-1] * 10 for _ in range(n + 1)]

        def solve(steps, cell):
            if steps == 0:
                return 1

            if dp[steps][cell] != -1:
                return dp[steps][cell]

            ways = 0
            for nxt in self.adj[cell]:
                ways = (ways + solve(steps - 1, nxt)) % self.MOD

            dp[steps][cell] = ways
            return ways

        result = 0
        for digit in range(10):
            result = (result + solve(n - 1, digit)) % self.MOD

        return result
