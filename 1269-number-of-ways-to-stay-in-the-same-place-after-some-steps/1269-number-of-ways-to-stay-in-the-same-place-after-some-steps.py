class Solution:
    MOD = 10**9 + 7
    def numWays(self, steps: int, arrLen: int) -> int:
        arrLen = min(arrLen, steps)             # optimization 1
        

        self.n = arrLen
        self.dp = [[-1] * (steps + 1) for _ in range(arrLen)]
        return self.solve(0, steps)

    def solve(self, idx, steps):
        if idx < 0 or idx >= self.n:
            return 0
        
        if steps == 0:
            return 1 if idx == 0 else 0

        if self.dp[idx][steps] != -1:
            return self.dp[idx][steps]

        res  = self.solve(idx + 1, steps - 1)              # RIGHT
        res += self.solve(idx - 1, steps - 1)              # LEFT
        res += self.solve(idx, steps - 1)                  # STAY

        res %= self.MOD
        self.dp[idx][steps] = res
        return res
        