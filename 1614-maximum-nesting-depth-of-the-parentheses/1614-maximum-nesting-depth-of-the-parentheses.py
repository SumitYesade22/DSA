class Solution:
    def maxDepth(self, s: str) -> int:
        m=0
        stack=deque()
        for i in range(len(s)):
            if s[i]=='(':
                stack.append(s[i])
            elif s[i]==')':
                if  stack:
                    stack.popleft()
            m=max(m,len(stack))
        return m
        