class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        if k==1:
            return 0
        ans=float('inf')
        for i in range(len(nums) - k + 1):
            ans = min(ans, nums[i + k - 1] - nums[i])
        return ans

        