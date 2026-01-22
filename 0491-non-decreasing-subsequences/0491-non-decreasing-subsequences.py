class Solution:
    def findSubsequences(self, nums: List[int]) -> List[List[int]]:
        self.ans = set()
        self.solve(0, -1, [], nums)
        return [list(seq) for seq in self.ans]

    def solve(self, i, prev, temp, nums):
        if len(temp) >= 2:
            self.ans.add(tuple(temp))  

        if i >= len(nums):
            return

       
        if prev == -1 or nums[prev] <= nums[i]:
            self.solve(i + 1, i, temp + [nums[i]], nums)

    
        self.solve(i + 1, prev, temp, nums)
        