class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        m=0
        i=0
        while i<len(nums):
            c=0
            while i<len(nums) and nums[i]==1:
                i+=1
                c+=1
            m=max(m,c)
            i+=1
        return m
                
        