class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        indegree = [0] * n
        outdegree = [0] * n

        for a, b in trust:
            outdegree[a - 1] += 1
            indegree[b - 1] += 1

        for i in range(n):
            if outdegree[i] == 0 and indegree[i] == n - 1:
                return i + 1

        return -1
