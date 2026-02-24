class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        n=len(nums)
        arr=[0]*n
        for i in range(len(nums)):
            arr[i]=nums[nums[i]]
        return arr
        