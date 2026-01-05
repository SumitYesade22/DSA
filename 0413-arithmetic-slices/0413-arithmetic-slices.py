class Solution:
    def numberOfArithmeticSlices(self, nums: List[int]) -> int:
        curr=0
        total=0
        for i in range(1,len(nums)-1):
            if nums[i]-nums[i-1]==nums[i+1]-nums[i]:
                curr+=1
                total+=curr
            else:
                curr=0
        return total


        