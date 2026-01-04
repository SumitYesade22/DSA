class Solution:
    def maxFreqSum(self, s: str) -> int:
        freq=Counter(s)
        maxc=0
        maxv=0
        vowel=['a','e','i','o','u']
        for key,val in freq.items():
            if key in vowel:
                maxv=max(maxv,val)
            else:
                maxc=max(maxc,val)
        return maxv+maxc

        