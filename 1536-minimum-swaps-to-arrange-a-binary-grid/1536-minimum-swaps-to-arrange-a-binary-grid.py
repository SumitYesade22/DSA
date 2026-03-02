class Solution:
    def minSwaps(self, grid: List[List[int]]) -> int:
        n = len(grid)

        # endZeros[i] = count of consecutive 0s from the end of ith row
        endZeros = [0] * n

        for i in range(n):
            j = n - 1
            count = 0
            while j >= 0 and grid[i][j] == 0:
                count += 1
                j -= 1
            endZeros[i] = count

        steps = 0

        for i in range(n):
            need = n - i - 1
            j = i

            # find a row with enough trailing zeros
            while j < n and endZeros[j] < need:
                j += 1

            if j == n:
                return -1

            # count swaps needed
            steps += (j - i)

            # bubble the row up
            while j > i:
                endZeros[j], endZeros[j - 1] = endZeros[j - 1], endZeros[j]
                j -= 1

        return steps
        