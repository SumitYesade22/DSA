class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        boxTypes.sort(key=lambda x:x[1],reverse=True)
        i=0
        ans=0
        while truckSize>0 and i<len(boxTypes):
            n=boxTypes[i][0]
            u=boxTypes[i][1]
            num=min(n,truckSize)
            truckSize-=num
            while num > 0:
                ans+=u
                num-=1
            i+=1
           
        return ans


      

        