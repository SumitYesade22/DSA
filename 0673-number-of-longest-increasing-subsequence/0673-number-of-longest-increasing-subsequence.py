class Solution:
    def findNumberOfLIS(self, nums: List[int]) -> int:
        n = len(nums)
        
        # dp[i][prev+1] = (length, count)
        dp = [[None] * (n + 1) for _ in range(n)]

        def solve(i, prev):
            if i == n:
                return (0, 1)   

            if dp[i][prev + 1] is not None:
                return dp[i][prev + 1]

            
            skip_len, skip_cnt = solve(i + 1, prev)

            take_len, take_cnt = 0, 0
            if prev == -1 or nums[prev] < nums[i]:
                tl, tc = solve(i + 1, i)
                take_len = 1 + tl
                take_cnt = tc

            if take_len > skip_len:
                res = (take_len, take_cnt)
            elif take_len < skip_len:
                res = (skip_len, skip_cnt)
            else:
                res = (skip_len, take_cnt + skip_cnt)

            dp[i][prev + 1] = res
            return res

        length, count = solve(0, -1)
        return count
        