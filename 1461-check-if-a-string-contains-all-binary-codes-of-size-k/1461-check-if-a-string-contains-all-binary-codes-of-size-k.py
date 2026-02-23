class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        n=len(s)
        res=set()
        i=0
        j=k-1
        while j<n:
            res.add(s[i:j+1])
            j+=1
            i+=1
        return len(res)==2**k

        