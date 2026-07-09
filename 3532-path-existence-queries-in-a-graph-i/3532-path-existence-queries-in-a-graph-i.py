from typing import List

class Solution:
    def pathExistenceQueries(self, n: int, nums: List[int], maxDiff: int, queries: List[List[int]]) -> List[bool]:
        # Array to store the component ID for each index
        carr = [0] * len(nums)
        c = 0
        
        # Group adjacent elements into components based on maxDiff
        for i in range(1, len(nums)):
            if nums[i] - nums[i-1] <= maxDiff:
                carr[i] = c
            else:
                c += 1
                carr[i] = c
                
        # Answer each query by checking if both indices share the same component ID
        ans = []
        for u, v in queries:
            ans.append(carr[u] == carr[v])
            
        return ans
