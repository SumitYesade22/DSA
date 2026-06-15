class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n = len(nums)
        
        # Calculate total sum of array elements and initial F(0)
        total_sum = sum(nums)
        F = sum(i * num for i, num in enumerate(nums))
        
        result = F
        
        # Compute next rotations using the recurrence relation:
        # F(k) = F(k-1) + total_sum - n * nums[n - k]
        for k in range(n):
            new_F = F + total_sum - n * nums[n - 1 - k]
            result = max(result, new_F)
            F = new_F
            
        return result
        