class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        self.ans = []
        self.dfs(0, [0], graph)
        return self.ans

    def dfs(self, node, path, graph):
        if node == len(graph) - 1:
            self.ans.append(path.copy())
            return

        for nei in graph[node]:
            path.append(nei)
            self.dfs(nei, path, graph)
            path.pop()
        


        