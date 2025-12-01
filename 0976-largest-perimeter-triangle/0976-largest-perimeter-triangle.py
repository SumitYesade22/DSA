class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        n=len(nums)
        nums.sort()
        if n<3:
            return 0
        for i in range(n-3,-1,-1):
            if nums[i]+nums[i+1]>nums[i+2]:
                return nums[i]+nums[i+1]+nums[i+2]
        return 0
        