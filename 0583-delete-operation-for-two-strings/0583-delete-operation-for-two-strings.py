class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        dp=[[-1]*len(word2) for i in range(len(word1))]
        ans=self.lcs(word1,word2,0,0,dp)
        return len(word1)+len(word2)-2*ans

    def lcs(self,word1,word2,i,j,dp):
        if i>=len(word1) or j>=len(word2):
            return 0
        if dp[i][j]!=-1:
            return dp[i][j]
        if word1[i]==word2[j]:
            dp[i][j] = self.lcs(word1,word2,i+1,j+1,dp)+1
        else:
            dp[i][j] = max(self.lcs(word1,word2,i+1,j,dp),self.lcs(word1,word2,i,j+1,dp))
        return dp[i][j]