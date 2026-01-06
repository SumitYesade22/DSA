class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        mp=defaultdict(int)
        ed=len(edges)
        for u,v in edges:
            mp[u]+=1
            mp[v]+=1
            if mp[u]==ed:
                return u
            if mp[v]==ed:
                return v
        return -1
        