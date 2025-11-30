class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        dp=[[0]*len(matrix[0]) for _ in range(len(matrix))]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                dp[i][j]=-1
        ans=0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j]==1:
                     ans+=self.rec(i,j,matrix,dp)
        return ans
    def rec(self,i,j,matrix,dp):
        if i>=len(matrix) or j>=len(matrix[0]) or matrix[i][j]==0:
            return 0
        if dp[i][j]!=-1:
            return dp[i][j]
        right=self.rec(i,j+1,matrix,dp)
        below=self.rec(i+1,j,matrix,dp)
        dia=self.rec(i+1,j+1,matrix,dp)
        dp[i][j]=1+min(right,below,dia)
        return dp[i][j]

        