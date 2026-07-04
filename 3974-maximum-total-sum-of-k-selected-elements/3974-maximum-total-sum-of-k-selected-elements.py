class Solution:
    def maxSum(self, nums: list[int], k: int, mul: int) -> int:
        nums.sort()
        n=len(nums)-1
        ans=0
        while n>=0 and k>0:
            if mul==0:
                ans+=nums[n]
            else:
                temp=nums[n]*mul
                mul-=1
                ans+=temp
            k-=1
            n-=1
        return ans


        