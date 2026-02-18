class Solution:
    def rob(self, nums, colors):
        n = len(nums)
        dp = [[-1]*2 for _ in range(n)]
        
        def solve(i, prev_taken):
            if i == n:
                return 0
            
            if dp[i][prev_taken] != -1:
                return dp[i][prev_taken]
            
            # Option 1: Skip
            skip = solve(i+1, 0)
            
            # Option 2: Take (if allowed)
            take = 0
            if prev_taken == 0:
                take = nums[i] + solve(i+1, 1)
            else:
                # previous was taken
                if colors[i] != colors[i-1]:
                    take = nums[i] + solve(i+1, 1)
            
            dp[i][prev_taken] = max(skip, take)
            return dp[i][prev_taken]
        
        return solve(0, 0)