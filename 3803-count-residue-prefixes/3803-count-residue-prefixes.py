class Solution:
    def residuePrefixes(self, s: str) -> int:
        n=len(s)
        ans=0
        for i in range(1,n+1):
            prefix=s[:i]
            l=len(set(prefix))
            if l==len(prefix)%3:
                ans+=1
        return ans
        