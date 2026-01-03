class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        ans=[]
        prev=-1
        for i in range(len(words)):
            if groups[i]!=prev:
                prev=groups[i]
                ans.append(words[i])
        return ans
            
        