class Solution:
    def canCross(self, stones: List[int]) -> bool:
        if 1 not in stones:
            return False
        
        self.memo = {}
        stone_set = set(stones)  # faster lookup
        
        return self.solve(stone_set, stones[-1], 1, 1)


    def solve(self, stone_set, last, cp, cj):
        # If reached the last stone
        if cp == last:
            return True
        
        # Invalid jump
        if cj <= 0:
            return False
        
        # Memo check
        if (cp, cj) in self.memo:
            return self.memo[(cp, cj)]
        
        # If current position is not a stone
        if cp not in stone_set:
            self.memo[(cp, cj)] = False
            return False
        
        # Three possible jumps
        ans = (
            self.solve(stone_set, last, cp + (cj - 1), cj - 1) or
            self.solve(stone_set, last, cp + cj, cj) or
            self.solve(stone_set, last, cp + (cj + 1), cj + 1)
        )
        
        self.memo[(cp, cj)] = ans
        return ans
