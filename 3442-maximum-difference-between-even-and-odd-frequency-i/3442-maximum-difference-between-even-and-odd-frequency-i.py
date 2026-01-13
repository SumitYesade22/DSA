class Solution:
    def maxDifference(self, s: str) -> int:
        f=Counter(s)
        odd=0
        even=len(s)
        for count in f.values():
            if count%2==1:
                odd=max(odd,count)
            else:
                even=min(even,count)
        return odd-even
        