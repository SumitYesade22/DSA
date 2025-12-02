class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        dp=[[-1]*2 for _ in range(len(prices))]
        ans=self.solve(prices,0,1,dp)
        return ans
    def solve(self,prices,i,buy,dp):
        if len(prices)<=i:
            return 0
        if dp[i][buy]!=-1:
            return dp[i][buy]
        profit=0
        if buy==1:
            bought=self.solve(prices,i+1,0,dp)-prices[i]
            notb=self.solve(prices,i+1,1,dp)
            profit=max(bought,notb)
        else:
            sold=self.solve(prices,i+2,1,dp)+prices[i]
            nots=self.solve(prices,i+1,0,dp)
            profit=max(sold,nots)
        dp[i][buy]=profit
        return profit