class Solution:
    def processStr(self, s: str) -> str:
        res=""
        for ch in s:
            if ch.isalpha():
                res+=ch
            elif ch=='*':
                if len(res)!=0:
                    res=res[:-1]
            elif ch=='#':
                res+=res[:]
            else:
                res=res[::-1]
        return res
       


        