class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        ans=0
        i=0
        for num in s:
            if i<len(g) and g[i]<=num:
                i+=1
        return i
            
        