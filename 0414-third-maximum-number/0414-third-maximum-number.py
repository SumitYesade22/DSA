class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        stack=deque()
        nums.sort(reverse=True)
        for num in nums:
            if len(stack)!=0 and stack[-1]==num:
                continue
            else:
                stack.append(num)
                if len(stack)==3:
                    return stack[-1]
        return stack[0]
        