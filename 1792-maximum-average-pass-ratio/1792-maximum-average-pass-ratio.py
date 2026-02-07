class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        pq=[]
        n=len(classes)
        for i in range(n):
            pr=classes[i][0]/classes[i][1]
            newpr=(classes[i][0]+1)/(classes[i][1]+1)
            dif=newpr-pr
            heapq.heappush(pq,(-dif,i))
        
        while extraStudents!=0:
            maxdif,idx=heapq.heappop(pq)
            maxdif=-maxdif
            classes[idx][0]+=1
            classes[idx][1]+=1
            newdif=((classes[idx][0]+1)/(classes[idx][1]+1))-(classes[idx][0])/(classes[idx][1])
            heapq.heappush(pq,(-newdif,idx))
            extraStudents-=1
        sum=0
        for i in range(n):
            sum+=classes[i][0]/classes[i][1]
        return sum/n
        
        