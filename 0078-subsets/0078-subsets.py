class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        nums.sort()                     
        res = set()
        self.solve(0, nums, [], res)
        return [list(t) for t in res]   

    def solve(self, i, nums, temp, res):
        if i == len(nums):
            res.add(tuple(temp))       
            return
        
        
        self.solve(i + 1, nums, temp + [nums[i]], res)

        
        self.solve(i + 1, nums, temp, res)
