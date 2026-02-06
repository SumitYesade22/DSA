class Solution:
    def minRemoval(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)

        i = 0
        ans = 0   

        for j in range(n):
            while nums[i] * k < nums[j]:
                i += 1
            ans = max(ans, j - i + 1)

        return n - ans