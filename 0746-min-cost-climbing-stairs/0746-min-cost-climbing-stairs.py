class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        dp=[-1]*len(cost)
        ans1=self.solve(cost,0,dp)
        ans2=self.solve(cost,1,dp)
        return min(ans1,ans2)

    def solve(self,cost,i,dp):
        if i >= len(cost):
            return 0
        if dp[i]!=-1:
            return dp[i]
        
        dp[i]=min(cost[i]+self.solve(cost,i+1,dp),cost[i]+self.solve(cost,i+2,dp))
        return dp[i]