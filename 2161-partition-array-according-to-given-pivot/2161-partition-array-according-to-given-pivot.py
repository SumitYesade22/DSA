class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        ans = [0] * len(nums)
        idx = 0

        
        for x in nums:
            if x < pivot:
                ans[idx] = x
                idx += 1

      
        for x in nums:
            if x == pivot:
                ans[idx] = x
                idx += 1

      
        for x in nums:
            if x > pivot:
                ans[idx] = x
                idx += 1

        return ans
