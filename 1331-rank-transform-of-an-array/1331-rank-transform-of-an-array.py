class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        new=arr.copy()
        arr.sort()
        r=1
        s={}
        for num in arr:
            if num in s:
                continue
            else:
                s[num]=r
                r+=1
        for i,val in enumerate(new):
            new[i]=s[val]
        return new
        