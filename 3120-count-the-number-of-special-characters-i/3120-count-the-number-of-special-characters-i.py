class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lower=set(c for c in word if c.islower())
        upper=set(c.lower() for c in word if c.isupper())
        return len(lower & upper)
        