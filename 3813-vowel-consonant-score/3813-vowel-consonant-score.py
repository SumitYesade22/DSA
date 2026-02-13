class Solution:
    def vowelConsonantScore(self, s: str) -> int:
        c=0
        v=0
        for char in s:
            if char.isalpha():
                if char in ['a','e','i','o','u']:
                    v+=1
                else:
                    c+=1
        if c>0:
            return v//c
        return 0
        