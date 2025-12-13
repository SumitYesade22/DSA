class Solution:
    def mostPoints(self, questions: List[List[int]]) -> int:
        dp=[-1]*(len(questions)+1)
        ans=self.solve(questions,0,dp)
        return ans
    def solve(self,questions,i,dp):

        if i>=len(questions):
            return 0
        if dp[i]!=-1:
            return dp[i]
        take=questions[i][0]+self.solve(questions,i+1+questions[i][1],dp)
        notake=self.solve(questions,i+1,dp)

        
        dp[i]=max(take,notake)
        return dp[i]
        
                             

