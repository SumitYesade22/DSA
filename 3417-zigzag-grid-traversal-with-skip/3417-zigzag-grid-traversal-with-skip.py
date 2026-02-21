class Solution:
    def zigzagTraversal(self, grid: List[List[int]]) -> List[int]:
        ans=[]
        i=0
        for row in grid:
            if i%2==0:
                ans+=row[::1]
            else:
                ans+=row[::-1]
            i+=1
        return ans[::2]

        