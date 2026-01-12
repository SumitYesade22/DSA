class Solution:
    def repeatedCharacter(self, s: str) -> str:
        container=set()
        for i in range(len(s)):
            if s[i] in container:
                return s[i]
            container.add(s[i])
        