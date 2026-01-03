class Solution:
    def minimumDeletions(self, s: str) -> int:
        stack=deque()
        i=0
        d=0
        while i<len(s):
            if len(stack)!=0 and s[i]=='a' and stack[-1]=='b':
                d+=1
                stack.pop()
                i+=1
                continue
            stack.append(s[i])
            i+=1
        return d

        