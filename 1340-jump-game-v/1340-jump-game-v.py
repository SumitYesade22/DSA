class Solution:
    def maxJumps(self, arr: List[int], d: int) -> int:
        n = len(arr)
        t = [-1] * n

        def solve(i: int) -> int:
            if t[i] != -1:
                return t[i]

            result = 1 

            # move left
            for j in range(i - 1, max(-1, i - d - 1), -1):
                # can't jump further once taller/equal element appears
                if arr[j] >= arr[i]:
                    break
                result = max(result, 1 + solve(j))

            # move right
            for j in range(i + 1, min(n, i + d + 1)):
                # can't jump further once taller/equal element appears
                if arr[j] >= arr[i]:
                    break
                result = max(result, 1 + solve(j))

            t[i] = result
            return t[i]

        max_jump = 1
        # We need to try from every index
        for i in range(n):
            max_jump = max(max_jump, solve(i))

        return max_jump