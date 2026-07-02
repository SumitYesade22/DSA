class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        ans=0
        for num in range(low, high+1):
            s=str(num)
            if len(s)%2!=0:
                continue
            first=sum([int(n) for n in s[:len(s)//2]])
            last=sum([int(n) for n in s[len(s)//2:]])
            if first==last:
                ans+=1
        return ans

        