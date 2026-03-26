class Solution:
    def canMakePaliQueries(self, s: str, queries: List[List[int]]) -> List[bool]:
        n = len(s)
        prefix = [0] * (n + 1)

        # Build prefix bitmask
        for i in range(n):
            prefix[i + 1] = prefix[i] ^ (1 << (ord(s[i]) - ord('a')))

        ans = []

        for l, r, k in queries:
            mask = prefix[r + 1] ^ prefix[l]

            # count set bits (odd characters)
            odd = bin(mask).count('1')

            # need at most odd//2 replacements
            ans.append(odd // 2 <= k)

        return ans