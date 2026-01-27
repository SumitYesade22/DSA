class Solution:
    def doesAliceWin(self, s: str) -> bool:
        c=0
        vowels="aeiou"
        for ch in s:
            if ch in vowels:
                c+=1
        if c==0:
             return False
        return True

        