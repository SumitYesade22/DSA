from typing import List

class Solution:
    def __init__(self):
        self.directions = [(0, 1), (0, -1), (-1, 0), (1, 0)]

    def numberOfIslandsDFS(self, matrix: List[List[int]], i: int, j: int):
        if (
            i < 0 or i >= len(matrix) or
            j < 0 or j >= len(matrix[0]) or
            matrix[i][j] == 1
        ):
            return

        matrix[i][j] = 1  # mark visited

        for di, dj in self.directions:
            self.numberOfIslandsDFS(matrix, i + di, j + dj)

    def regionsBySlashes(self, grid: List[str]) -> int:
        rows, cols = len(grid), len(grid[0])
        regions = 0

        # create expanded matrix (rows*3 x cols*3)
        matrix = [[0] * (cols * 3) for _ in range(rows * 3)]

        # populate the matrix based on '/' and '\'
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == '/':
                    matrix[i*3][j*3 + 2] = 1
                    matrix[i*3 + 1][j*3 + 1] = 1
                    matrix[i*3 + 2][j*3] = 1
                elif grid[i][j] == '\\':
                    matrix[i*3][j*3] = 1
                    matrix[i*3 + 1][j*3 + 1] = 1
                    matrix[i*3 + 2][j*3 + 2] = 1

        # count regions using DFS (number of islands)
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j] == 0:
                    self.numberOfIslandsDFS(matrix, i, j)
                    regions += 1

        return regions
