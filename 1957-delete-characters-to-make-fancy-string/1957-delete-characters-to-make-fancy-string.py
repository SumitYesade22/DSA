class Solution:
    def makeFancyString(self, s: str) -> str:
        ans=s[0]
        if len(s)==1:
            return ans
        for i in range(1,len(s)-1):
            if s[i-1]==s[i] and s[i]==s[i+1]:
                continue
            else:
                ans+=s[i]
        ans+=s[-1]
        return ans
        