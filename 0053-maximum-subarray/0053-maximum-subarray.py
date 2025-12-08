class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxval=-10**17
        cval=0
        for i in range(len(nums)):
            cval+=nums[i]
            maxval=max(maxval,cval)
            if cval<0:
                cval=0
        return maxval
        