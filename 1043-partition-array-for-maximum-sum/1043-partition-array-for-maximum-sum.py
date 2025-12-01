class Solution:
    def maxSumAfterPartitioning(self, arr: List[int], k: int) -> int:
        t=[-1]*501
        ans=self.solve(0,arr,k,t)
        return ans
    def solve(self,i,arr,k,t):
        if i>=len(arr):
            return 0
        if t[i]!=-1:
            return t[i]
        maxnum=-1
        result=0
        for idx in range(i,len(arr)):
            if idx-i+1>k:
                break
            maxnum=max(maxnum,arr[idx])
            result=max(result,maxnum*(idx-i+1)+self.solve(idx+1,arr,k,t))
        t[i]=result
        return result

        