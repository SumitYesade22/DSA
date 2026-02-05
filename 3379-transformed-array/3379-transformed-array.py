class Solution:
    def constructTransformedArray(self, nums: List[int]) -> List[int]:
        n=len(nums)
        ans=[0]*n
        for i in range(n):
            shift=nums[i]%n
            newidx=(i+shift)%n
            ans[i]=nums[newidx]
        return ans

        