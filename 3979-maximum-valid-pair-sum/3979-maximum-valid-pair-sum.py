class Solution:
    def maxValidPairSum(self, nums: list[int], k: int) -> int:
        leftmax=float("-inf")
        ans=float("-inf")
        for i in range(k,len(nums)):
            leftmax=max(leftmax,nums[i-k])
            ans=max(ans,leftmax+nums[i])
        return ans
        