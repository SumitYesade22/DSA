class Solution:
    def predecessor(self, prev: str, curr: str) -> bool:
        M, N = len(prev), len(curr)
        
        
        if M >= N or N - M != 1:
            return False
        
        i = 0
        j = 0
        
        while i < M and j < N:
            if prev[i] == curr[j]:
                i += 1
            j += 1
        
        return i == M  

    def longestStrChain(self, words: list[str]) -> int:
        words.sort(key=len)
        n = len(words)
        
       
        dp = [[-1] * (n+1) for _ in range(n+1)]
        
        def lis(prevIdx, currIdx):
            if currIdx == n:
                return 0
            
            if prevIdx != -1 and dp[prevIdx][currIdx] != -1:
                return dp[prevIdx][currIdx]
            
            
            take = 0
            if prevIdx == -1 or self.predecessor(words[prevIdx], words[currIdx]):
                take = 1 + lis(currIdx, currIdx + 1)
            
            
            skip = lis(prevIdx, currIdx + 1)
            
            if prevIdx != -1:
                dp[prevIdx][currIdx] = max(take, skip)
            
            return max(take, skip)

        return lis(-1, 0)
