class Solution:
    def minRemoval(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)

        i = 0
        j = 0
        ans = 0   # max valid window size

        while j < n:
            if nums[i] * k >= nums[j]:
                ans = max(ans, j - i + 1)  # window size
                j += 1
            else:
                i += 1

        return n - ans