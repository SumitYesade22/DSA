class Solution:
    def fillCups(self, amount: List[int]) -> int:
        h=[]
        for num in amount:
            if num!=0:
                h.append(-1*num)
        heapq.heapify(h)
        count=0
        while len(h)>=2:
            num1=-1*heapq.heappop(h)
            num2=-1*heapq.heappop(h)
            num1-=1
            num2-=1
            if num1!=0:
                heapq.heappush(h,num1*-1)
            if num2!=0:
                heapq.heappush(h,-1*num2)
            count+=1
        if h:
            count+=-1*heapq.heappop(h)
        return count
            


        