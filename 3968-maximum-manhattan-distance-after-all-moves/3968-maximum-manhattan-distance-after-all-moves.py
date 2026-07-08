class Solution:
    def maxDistance(self, moves: str) -> int:
        x = y = extra = 0

        for c in moves:
            if c == 'U':
                x += 1
            elif c == 'D':
                x -= 1
            elif c == 'L':
                y += 1
            elif c == 'R':
                y -= 1
            else:
                extra += 1

        return abs(x) + abs(y) + extra