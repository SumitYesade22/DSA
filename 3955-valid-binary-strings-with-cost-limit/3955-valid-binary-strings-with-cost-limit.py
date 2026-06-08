class Solution:
    def generateValidStrings(self, n: int, k: int) -> list[str]:
        self.result=[]
        self.current=['']*n
        self.k=k
        self.n=n
        self.backtrack(0,0,False)
        return self.result
    def backtrack(self,p,cost,prev_zero):
        if cost>self.k:
            return 
        if p==self.n:
            self.result.append(''.join(self.current))
            return 
        self.current[p]='0'
        self.backtrack(p+1,cost,True)
        if p==0 or prev_zero:
            self.current[p]='1'
            self.backtrack(p+1,cost+p,False)
        