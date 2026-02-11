class Solution:
    def mergeAdjacent(self, nums: List[int]) -> List[int]:
        stack=deque()
        stack.append(nums[0])
        i=1
        n=len(nums)
        while i<n:
            temp=nums[i]
            while i<n and len(stack)!=0 and temp==stack[-1]:
                stack.pop()
                temp=2*temp
                
            if i>=n:
                break
            stack.append(temp)
            i+=1
        newl=len(stack)
        ans=[0]*newl
        for i in range(newl-1,-1,-1):
            ans[i]=stack.pop()

        return ans
        