class Solution:
    def partitionString(self, s: str) -> int:
        n=len(s)
        i=0
        ans=0
        while i<n:
            t=set()
            while i<n and s[i] not in t:
                t.add(s[i])
                i+=1
            ans+=1
        return ans

        