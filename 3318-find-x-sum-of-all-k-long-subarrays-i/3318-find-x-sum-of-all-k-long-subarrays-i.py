class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        pq=[]
        c=Counter(nums[:k])
        i=0
        j=k-1
        ans=[]
        while j<len(nums):
            sm=self.solve(c,[],x)
            ans.append(sm)
            c[nums[i]] -= 1
            if c[nums[i]] == 0:
                del c[nums[i]]
            i+=1
            j+=1
            if j<len(nums):
                c[nums[j]]+=1
        return ans

    def solve(self,c,pq,x):
        for key,val in c.items():
            heapq.heappush(pq,(-val,-key))
        sum=0
        while x!=0 and pq:
            occ,num=heapq.heappop(pq)
            occ=-occ
            num=-num
            sum+=num*occ
            x-=1
        return sum
        

        