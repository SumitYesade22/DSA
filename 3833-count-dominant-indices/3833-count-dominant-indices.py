class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        avglist=[0]*len(nums)
        sum=0
        n=1
        for i in range(len(nums)-1,-1,-1):
            sum+=nums[i]
            avglist[i]=sum/n
            n+=1
        ans=0
        for i in range(len(nums)-1):
            if nums[i]>avglist[i+1]:
                ans+=1
        return ans
        