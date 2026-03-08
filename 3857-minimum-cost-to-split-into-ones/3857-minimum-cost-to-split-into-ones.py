class Solution:
    def minCost(self, n: int) -> int:
        sum=0
        while n!=1:
            sum+=(n-1)*1
            n=n-1
        return sum
        