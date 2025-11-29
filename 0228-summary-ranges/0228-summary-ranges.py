
class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        n = len(nums)
        if n == 0:
            return []

        i = 1
        ans = []
        while i <= n:
            count = 1
            prev = nums[i - 1]
            while i < n and nums[i] == prev + 1:
                prev = nums[i]
                i += 1
                count += 1
            if count == 1:
                ans.append(str(prev))
            else:
                ans.append(f"{nums[i - count]}->{nums[i - 1]}")
            i += 1
        return ans
