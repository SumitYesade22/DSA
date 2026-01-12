class Solution:
    def replaceDigits(self, s: str) -> str:
        res=""
        for ch in s:
            if ch.isdigit():
                res+=chr(ord(res[-1])+int(ch))
            else:
                res+=ch
        return res
        