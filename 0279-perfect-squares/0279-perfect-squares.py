class Solution:
    def numSquares(self, n: int) -> int:
        self.dp=[-1]*(n+1)
        return self.solve(n)
    def solve(self,x):
        if x == 0:
            return 0
        if self.dp[x]!=-1:
            return self.dp[x]
        ans = float('inf')
        i = 1
        while i * i <= x:    
            ans = min(ans, 1 + self.solve(x - i*i))
            i += 1
        self.dp[x]=ans
        return ans
        