class Solution:
    def numberOfWays(self, corridor: str) -> int:
        arr=[]
        mod=1000000007
        c=0
        for i in range(len(corridor)):
            if corridor[i]=='S':
                c+=1
                arr.append(i)
        if c%2!=0 or c==0:
            return 0
        mul=1
        for i in range(1,len(arr)-1,2):
            mul = (mul * (arr[i+1] - arr[i])) % mod
        return mul
