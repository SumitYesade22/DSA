class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s=set()
        for num in nums:
            s.add(num)
        
        ans=len(s)==len(nums)

        if ans==True:
            return False
        return True