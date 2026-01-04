class Solution:
    def numTilePossibilities(self, tiles: str) -> int:
        self.tiles=tiles
        self.n=len(tiles)
        self.used=[False]*self.n
        self.result=set()
        self.solve("")
        return len(self.result)-1
    def solve(self,curr):
        self.result.add(curr)
        for i in range(self.n):
            if self.used[i]:
                continue
            self.used[i]=True
            self.solve(curr+self.tiles[i])
            self.used[i]=False
        return 
        
