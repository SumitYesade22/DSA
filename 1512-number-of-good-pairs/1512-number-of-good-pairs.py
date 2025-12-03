class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        s=Counter(nums)
        ans=0
        for key,val in s.items():
            if val>1:
                ans+=(val*(val+1)//2)-val
        return ans    
        