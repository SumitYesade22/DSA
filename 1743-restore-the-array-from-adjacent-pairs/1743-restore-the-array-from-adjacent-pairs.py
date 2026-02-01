class Solution:
    def restoreArray(self, adjacentPairs: List[List[int]]) -> List[int]:
        self.res=[]
        d=defaultdict(list)
        for pair in adjacentPairs:
            u=pair[0]
            v=pair[1]
            d[u].append(v)
            d[v].append(u)
        st=-1
        for e in d:
            if len(d[e])==1:
                st=e
        self.dfs(st,-1,d)
        return self.res
    def dfs(self,st,prev,d):
        self.res.append(st)
        for p in d[st]:
            if p!=prev:
                self.dfs(p,st,d)
        return 
    
        