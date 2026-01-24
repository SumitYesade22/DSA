class Solution:
    def minimumChairs(self, s: str) -> int:
        stack=deque()
        m=0
        for ch in s:
            if ch=='E':
                stack.append(ch)
                m=max(m,len(stack))
            else:
                stack.pop()
        return m
        