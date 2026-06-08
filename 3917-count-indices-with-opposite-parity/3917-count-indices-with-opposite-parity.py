class Solution:
    def countOppositeParity(self, nums: list[int]) -> list[int]:
        n = len(nums)
        ans = [0] * n
        
        total_even = sum(1 for x in nums if x % 2 == 0)
        total_odd = n - total_even
        
        for i in range(n):
            if nums[i] % 2 == 0:
               
                total_even -= 1
                ans[i] = total_odd
            else:
                
                total_odd -= 1
                ans[i] = total_even
                
        return ans
