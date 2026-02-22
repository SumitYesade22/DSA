class Solution:
    def binaryGap(self, n: int) -> int:
        n=bin(n)[2:]
        ans=0
        prev=-1
        for i in range(len(n)):
            if n[i]=='1':
                if prev!=-1:
                    ans=max(ans,i-prev)
                prev=i
        return ans


        