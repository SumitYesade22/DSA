class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        ans=[]
        for i in range(len(words)):
            freq=Counter(words[i])
            if x in freq:
                ans.append(i)
        return ans
        