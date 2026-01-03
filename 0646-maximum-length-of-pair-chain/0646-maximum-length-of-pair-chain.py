class Solution:
    def findLongestChain(self, pairs: List[List[int]]) -> int:
        self.dp=[[-1]*len(pairs) for i in range(len(pairs))]
        pairs.sort(key=lambda x:x[1])
        ans=self.solve(0,pairs,-1)
        return ans
    def solve(self,i,pairs,prev):
        if i>=len(pairs):
            return 0
        take=0
        if self.dp[i][prev]!=-1:
            return self.dp[i][prev]
        if prev==-1:
            take=1+self.solve(i+1,pairs,i)
        elif pairs[prev][1]<pairs[i][0]:
            take=1+self.solve(i+1,pairs,i)
        nottake=self.solve(i+1,pairs,prev)
        self.dp[i][prev]= max(take,nottake)
        return max(take,nottake)
        
        
        