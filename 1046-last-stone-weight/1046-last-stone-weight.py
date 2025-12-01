class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        maxheap=[-s for s in stones]
        heapq.heapify(maxheap)
        while(len(maxheap)>1):
            one=-heapq.heappop(maxheap)
            two=-heapq.heappop(maxheap)
            if one!=two:
                heapq.heappush(maxheap,-(one-two))

        return -1*heapq.heappop(maxheap) if maxheap else 0