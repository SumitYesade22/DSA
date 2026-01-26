class Solution:
    def findLexSmallestString(self, s: str, a: int, b: int) -> str:
        self.smallest = s
        self.visited = set()
        self.a = a
        self.b = b
        self.n = len(s)

        self.dfs(s)
        return self.smallest

    def dfs(self, curr: str):
        if curr in self.visited:
            return
        self.visited.add(curr)

        if curr < self.smallest:
            self.smallest = curr

        # operation 1
        chars = list(curr)
        for i in range(1, len(chars), 2):
            chars[i] = str((int(chars[i]) + self.a) % 10)
        self.dfs("".join(chars))

        # operation 2
        rotated = curr[-self.b:] + curr[:-self.b]
        self.dfs(rotated)
        