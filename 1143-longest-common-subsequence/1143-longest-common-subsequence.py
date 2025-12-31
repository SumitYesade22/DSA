class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        self.dp={}
        self.m,self.n=len(text1),len(text2)
        ans=self.solve(0,0,text1,text2)
        return ans
    def solve(self,i,j,text1,text2):
        if i>=self.m or j>=self.n:
            return 0
        if (i,j) in self.dp:
            return self.dp[(i,j)]
        if text1[i]==text2[j]:
            self.dp[(i,j)]=1+self.solve(i+1,j+1,text1,text2)
        else:
            self.dp[(i,j)]=max(self.solve(i+1,j,text1,text2),self.solve(i,j+1,text1,text2))
        return self.dp[(i,j)]