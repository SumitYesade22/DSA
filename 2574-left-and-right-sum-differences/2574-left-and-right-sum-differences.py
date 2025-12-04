class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        sum=0
        for num in nums:
            sum+=num
        res=[]
        l=0
        for i in range(len(nums)):
            sum-=nums[i]
            res.append(abs(l-sum))
            l+=nums[i]
        return res

        
        