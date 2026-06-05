# Approach (Using DFS)
# T.C : O(m*n)
# S.C : O(m*n)

class Solution:
    # Directions dict ko directly class level par rakh diya
    directions = {
        1: [[0, -1], [0, 1]],
        2: [[-1, 0], [1, 0]],
        3: [[0, -1], [1, 0]],
        4: [[0, 1], [1, 0]],
        5: [[0, -1], [-1, 0]],
        6: [[-1, 0], [0, 1]]
    }

    def dfs(self, grid: list[list[int]], i: int, j: int, visited: list[list[bool]]) -> bool:
        if i == self.m - 1 and j == self.n - 1:
            return True
        
        visited[i][j] = True

        for direction in self.directions[grid[i][j]]:
            new_i = i + direction[0]
            new_j = j + direction[1]

            if new_i < 0 or new_i >= self.m or new_j < 0 or new_j >= self.n or visited[new_i][new_j]:
                continue
            
            # IMPORTANT = can you come back to i and j from new_i and new_j
            for backDir in self.directions[grid[new_i][new_j]]:
                if new_i + backDir[0] == i and new_j + backDir[1] == j:
                    if self.dfs(grid, new_i, new_j, visited):
                        return True
                        
        return False

    def hasValidPath(self, grid: list[list[int]]) -> bool:
        # hasValidPath ke andar hi m aur n initialize kar diye bina constructor ke
        self.m = len(grid)
        self.n = len(grid[0])

        visited = [[False] * self.n for _ in range(self.m)]
        # T.C : O(m*n)

        return self.dfs(grid, 0, 0, visited)
