class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        dp=[[-1]*n for _ in range(n)]

      
        def solve(i, prev):
            if i == n:
                return 0
            if dp[i][prev]!=-1:
                return dp[i][prev]

            take = 0
            if prev == -1 or nums[prev] < nums[i]:
                take = 1 + solve(i + 1, i)

            skip = solve(i + 1, prev)
            dp[i][prev]=max(take,skip)
            return max(take, skip)

        return solve(0, -1)
        
