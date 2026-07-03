class Solution:
    def maxAdjacentDistance(self, nums: List[int]) -> int:
        ans=0
        for i in range(len(nums)):
            temp=abs(nums[i]-nums[(i+1)%len(nums)])
            ans=max(ans,temp)
        return ans
        