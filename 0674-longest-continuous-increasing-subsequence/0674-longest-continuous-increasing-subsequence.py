class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        m=1
        mx=1
        for i in range(len(nums)-1):
            if nums[i]<nums[i+1]:
                m+=1
                mx=max(mx,m)
            else:
                m=1
        return mx
        