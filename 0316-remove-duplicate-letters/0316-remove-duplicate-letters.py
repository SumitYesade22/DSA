class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        taken=[False]*26
        lastIndex=[-1]*26
        result=[]
        for i in range(len(s)):
            lastIndex[ord(s[i])-ord('a')]=i
        
        for i, ch in enumerate(s):
            idx = ord(ch) - ord('a')

            if taken[idx]:
                continue

            while (result and
                   ch < result[-1] and
                   lastIndex[ord(result[-1]) - ord('a')] > i):
                removed = result.pop()
                taken[ord(removed) - ord('a')] = False

            result.append(ch)
            taken[idx] = True

        return "".join(result)
        