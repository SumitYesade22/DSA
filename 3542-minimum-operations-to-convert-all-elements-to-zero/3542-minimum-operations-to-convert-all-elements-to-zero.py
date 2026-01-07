class Solution:
    def minOperations(self, nums: List[int]) -> int:
        stack=deque()
        c=0
        for i in range(len(nums)):
            if nums[i]==0:
                stack.clear()
                continue
            while len(stack)!=0 and stack[-1]>nums[i]:
                stack.pop()
            if len(stack)!=0 and stack[-1]==nums[i]:
                continue
            else:
                stack.append(nums[i])
                c+=1
        return c



        