class Solution:
    def maximumAmount(self, coins: List[List[int]]) -> int:
        self.memo={}
        self.m=len(coins)
        self.n=len(coins[0])
        ans=self.solve(0,0,2,coins)
        return ans
    def solve(self,i,j,k,coins):
        if i>=self.m or j>=self.n:
            return -float('inf')
        if (i,j,k) in self.memo:
            return self.memo[(i,j,k)]
        if i == self.m - 1 and j == self.n - 1:
                if coins[i][j] < 0 and k > 0:
                    return max(coins[i][j], 0)
                return coins[i][j]
        take=coins[i][j]+max(self.solve(i+1,j,k,coins),self.solve(i,j+1,k,coins))
        skip_damage = float('-inf')
        if coins[i][j] < 0 and k > 0:
            skip_damage = 0 + max(self.solve(i + 1, j, k - 1,coins), self.solve(i, j + 1, k - 1,coins))
        self.memo[(i, j, k)] = max(take, skip_damage)
        return self.memo[(i, j, k)]
