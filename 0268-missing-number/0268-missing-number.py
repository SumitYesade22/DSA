class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sum=0
        for num in nums:
            sum+=num
        n=len(nums)
        mainsum=n*(n+1)//2
        return mainsum-sum