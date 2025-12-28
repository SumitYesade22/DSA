class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        self.dp=[[-1]*n for i in range(m)]
        ans=self.solve(m,n,0,0)
        return ans
    def solve(self,m,n,i,j):
        if i>=m or j>=n:
            return 0
        if self.dp[i][j]!=-1:
            return self.dp[i][j]
        if i==m-1 and j==n-1:
            return 1
        ans1=self.solve(m,n,i+1,j)
        ans2=self.solve(m,n,i,j+1)
        self.dp[i][j]=ans1+ans2
        return ans1+ans2
        