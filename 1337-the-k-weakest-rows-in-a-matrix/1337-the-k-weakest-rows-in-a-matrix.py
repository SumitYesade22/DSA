class Node:
    def __init__(self,s,i):
        self.s=s
        self.i=i
    def __lt__(self,other):
        if self.s==other.s:
            return self.i<other.i
        else:
            return self.s<other.s

class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        pq=[]
        for idx,row in enumerate(mat):
            ones=sum(row)
            heapq.heappush(pq,Node(ones,idx))
        ans=[]
        while k>0:
            node=heapq.heappop(pq)
            ans.append(node.i)
            k-=1
        return ans

        