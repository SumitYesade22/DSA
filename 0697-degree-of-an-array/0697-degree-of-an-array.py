class Solution:
    def findShortestSubArray(self, nums: List[int]) -> int:
        s = {}

        
        for i, val in enumerate(nums):
            if val not in s:
                s[val] = []
            s[val].append(i)

       
        degree = max(len(v) for v in s.values())

        ans = float('inf')

        
        for k, v in s.items():
            if len(v) == degree:
                ans = min(ans, v[-1] - v[0] + 1)

        return ans
