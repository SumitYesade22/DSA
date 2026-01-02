class Solution:
    def partition(self, s: str) -> List[List[str]]:
        n = len(s)
        result = []
        curr = []

        def isPalindrome(l, r):
            while l < r:
                if s[l] != s[r]:
                    return False
                l += 1
                r -= 1
            return True

        def backtrack(idx):
            if idx == n:
                result.append(curr[:])   # make a copy
                return
            
            for i in range(idx, n):
                if isPalindrome(idx, i):
                    curr.append(s[idx:i+1])
                    backtrack(i + 1)
                    curr.pop()

        backtrack(0)
        return result
        