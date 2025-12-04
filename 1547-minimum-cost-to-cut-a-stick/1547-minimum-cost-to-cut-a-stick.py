class Solution:
    def minCost(self, n: int, cuts: List[int]) -> int:
        cuts.insert(0,0)
        cuts.append(n)
        dp=[[-1]*len(cuts) for i in range(len(cuts))]
        cuts.sort()
        ans=self.solve(0,len(cuts)-1,cuts,dp)
        return ans
    def solve(self,l,r,cuts,dp):
        if r-l<=1:
            return 0
        res=10**18
        if dp[l][r]!=-1:
            return dp[l][r]
        for i in range(l+1,r):
            ans=cuts[r]-cuts[l]+self.solve(l,i,cuts,dp)+self.solve(i,r,cuts,dp)
            res=min(res,ans)
        dp[l][r]=res
        return res


        


        