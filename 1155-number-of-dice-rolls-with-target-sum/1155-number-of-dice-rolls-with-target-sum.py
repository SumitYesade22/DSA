class Solution:
    MOD=10**9+7
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        dp=[[-1]*1001 for i in range(31)]
        ans=self.solve(n,k,target,dp)
        return ans
    def solve(self,n,k,target,dp):
        if target<0:
            return 0
        if target==0 and n==0:
            return 1
        if n==0:
            return 0
        if dp[n][target]!=-1:
            return dp[n][target]
        ways=0
        for i in range(1,k+1):
            ways=(ways+self.solve(n-1,k,target-i,dp))%self.MOD
        dp[n][target]=ways
        return ways
        