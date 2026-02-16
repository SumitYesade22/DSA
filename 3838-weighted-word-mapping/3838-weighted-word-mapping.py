from typing import List

class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        ans = []
        for word in words:
            total = sum(weights[ord(c) - ord('a')] for c in word)
            rem = total % 26
            # map 0->'z', 1->'y', etc.
            ans.append(chr(ord('z') - rem))
        return "".join(ans)