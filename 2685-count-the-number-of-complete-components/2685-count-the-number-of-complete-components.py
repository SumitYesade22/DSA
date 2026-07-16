class Solution:
    def countCompleteComponents(self, n: int, edges: list[list[int]]) -> int:
        mp = [[] for i in range(n)]
        for num in edges:
            mp[num[0]].append(num[1])
            mp[num[1]].append(num[0])
        c = 0
        visited = [-1] * n
        for i, num in enumerate(visited):
            if num != -1:
                continue
            visited[i] = 0
            con = []
            self.dfs(i, visited, mp, con)
            v = len(con)
            ed = 0
            for node in con:
                ed += len(mp[node])
            if ed == v * (v - 1):
                c += 1
        return c

    def dfs(self, i, visited, mp, con):
        visited[i] = 0
        con.append(i)
        for neighbor in mp[i]:
            if visited[neighbor] != -1:
                continue
            self.dfs(neighbor, visited, mp, con)
        return
