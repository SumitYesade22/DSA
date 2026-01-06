class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        indegree=[0]*n
        c=0
        camp=-1
        for u,v in edges:
            indegree[v]+=1
        for i in range(n):
            if indegree[i]==0:
                camp=i
                c+=1
                if c>1:
                    return -1
        return camp

        