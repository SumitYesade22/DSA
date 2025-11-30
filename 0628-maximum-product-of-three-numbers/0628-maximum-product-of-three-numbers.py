class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        nums.sort()
        ans=-2**31
        pro=nums[-1]*nums[-2]*nums[-3]
        if len(nums)>3:
             ans=max(nums[-1]*nums[0]*nums[1],nums[0]*nums[-1]*nums[-2])
        ans=max(ans,pro)
        return ans

        