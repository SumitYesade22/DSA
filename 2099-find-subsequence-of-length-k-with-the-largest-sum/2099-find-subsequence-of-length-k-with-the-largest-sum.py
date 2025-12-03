class Node:
    def __init__(self,num,i):
        self.num=num
        self.i=i
    def __lt__(self,other):
        return self.i<other.i

class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        arr=[[0]*2 for i in range(len(nums))]
        for i,num in enumerate(nums):
            arr[i][0]=num
            arr[i][1]=i
        arr.sort(key=lambda x:x[0],reverse=True)
        i=0
        pq=[]
        
        while k > 0 :
            heapq.heappush(pq,Node(arr[i][0],arr[i][1]))
            k-=1
            i+=1
        ans=[]
        while pq:
            node=heapq.heappop(pq)
            ans.append(node.num)

        return ans   
            
        