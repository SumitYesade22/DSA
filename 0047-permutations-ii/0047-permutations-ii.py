class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        ans =set()
        visited = [False] * len(nums)
        self.solve(nums, visited, [], ans)
        return [list(s) for s in ans]

    def solve(self, nums, visited, temp, ans):
        if len(temp) == len(nums):
            ans.add(tuple(temp.copy()))
            return
        
        for i in range(len(nums)):
            if visited[i]:
                continue
            visited[i] = True
            self.solve(nums, visited, temp + [nums[i]], ans)
            visited[i] = False
        