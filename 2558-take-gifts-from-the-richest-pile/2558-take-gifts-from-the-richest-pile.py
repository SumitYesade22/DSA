class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        pq=[]
        for g in gifts:
            pq.append(-g)
        heapq.heapify(pq)
        while k!=0:
            k-=1
            num=-1*heapq.heappop(pq)
            heapq.heappush(pq,-1*floor(sqrt(num)))
        ans=0
        while pq:
            ans+=-1*heapq.heappop(pq)
        return ans
            


        