class Solution:
    def __init__(self):
        self.MOD=10**9+7
        self.grid=[(0,1),(1,0),(-1,0),(0,-1)]
    def findPaths(self, m: int, n: int, maxMove: int, startRow: int, startColumn: int) -> int:
        i=startRow
        j=startColumn
        self.dp={}
        ways=self.solve(m,n,i,j,maxMove)
        return ways
    def solve(self,m,n,i,j,maxMove):
        if i<0 or i>=m or j<0 or j>=n:
            return 1
        if (i,j,maxMove) in self.dp:
            return self.dp[(i,j,maxMove)]
        if maxMove<=0:
            return 0
        ways=0
        for p,k in self.grid:
            ways+=self.solve(m,n,i+p,j+k,maxMove-1)
        
        self.dp[(i,j,maxMove)]=ways%self.MOD
        return self.dp[(i,j,maxMove)]
        

        