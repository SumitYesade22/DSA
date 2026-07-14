from typing import List

class Solution:
    def subsequencePairCount(self, nums: List[int]) -> int:
        self.MOD = 10**9 + 7
        # FIX: Using a hash map (dictionary) avoids hardcoded array limits 
        # and stops IndexError bugs regardless of input sizes.
        self.memo = {}
        ans = self.solve(0, 0, 0, nums)
        return ans

    def solve(self, i, first, second, nums):
        # Base Case: Reached the end of the array
        if i == len(nums):
            # Both subsequences must be non-empty and have matching GCD values
            if first != 0 and second != 0 and first == second:
                return 1
            else:
                return 0
                
        # Look up state in our dynamic dictionary cache
        state = (i, first, second)
        if state in self.memo:
            return self.memo[state]
            
        # FIX: Mutually exclusive paths guarantee disjoint subsequences:
        # Choice 1: Skip the current element entirely
        skip = self.solve(i + 1, first, second, nums)
        
        # Choice 2: Put it ONLY into the first subsequence
        take = self.solve(i + 1, self.gcd(first, nums[i]), second, nums)
        
        # Choice 3: Put it ONLY into the second subsequence
        take1 = self.solve(i + 1, first, self.gcd(second, nums[i]), nums)
        
        # Aggregate safely with the modulo constraint
        self.memo[state] = (skip + take + take1) % self.MOD
        return self.memo[state]

    # YOUR CUSTOM FUNCTION (Now works perfectly)
    def gcd(self, a, b):
        while b > 0:
            temp = a
            a = b
            b = temp % b
        return a
