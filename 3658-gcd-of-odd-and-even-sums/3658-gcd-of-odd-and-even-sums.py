class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        sumodd=0
        odd=1
        even=2
        sumeven=0
        while n!=0:
            sumodd+=odd
            sumeven+=even
            odd+=2
            even+=2
            n-=1
        return self.gcd(sumodd,sumeven)
    def gcd(self,a,b):
        while b>0:
            temp=a
            a=b
            b=temp%b
        return a
