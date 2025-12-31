class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        self.dp={}
        coins.sort()
        ways=self.solve(amount,0,coins)
        return ways
    def solve(self,amount,i,coins):
        if amount==0:
            return 1
        if (amount,i) in self.dp:
            return self.dp[(amount,i)]
        if i>=len(coins):
            return 0
        if coins[i]>amount:
            return 0
        
        take=self.solve(amount-coins[i],i,coins)
        skip=self.solve(amount,i+1,coins)
        self.dp[(amount, i)] = take + skip
        return take+skip
        
        