class Solution:
    def smallestSubsequence(self, s: str) -> str:
        n = len(s)
        result = []

        taken = [False] * 26
        lastIndex = [-1] * 26

        
        for i, ch in enumerate(s):
            lastIndex[ord(ch) - ord('a')] = i

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
        