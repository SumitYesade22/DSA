class Solution:
    def centeredSubarrays(self, nums: List[int]) -> int:
        r=0
        for i in range(len(nums)):
            sum=0
            sub=set()
            for j in range(i, len(nums)):
                sum+=nums[j]
                sub.add(nums[j])
                if sum in sub:
                    r+=1
        return r
        