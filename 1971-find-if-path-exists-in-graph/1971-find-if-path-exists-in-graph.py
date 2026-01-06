class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph = defaultdict(list)
        for i in range(n):
            graph[i] = []

        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)   
        visited = [0] * n
        return self.dfs(graph, source, destination, visited)
    def dfs(self, graph, source, destination, visited):
        if source == destination:
            return True

        visited[source] = 1

        for nxt in graph[source]:
            if visited[nxt] == 0:
                if self.dfs(graph, nxt, destination, visited):
                    return True

        return False

        
        