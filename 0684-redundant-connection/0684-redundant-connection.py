class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        n = len(edges)
        adj = defaultdict(list)

        for u, v in edges:
            # If both nodes already exist, check for cycle
            if u in adj and v in adj:
                visited = [False] * (n + 1)
                if self.dfs(adj, u, v, visited):
                    return [u, v]

            # Add edge to graph
            adj[u].append(v)
            adj[v].append(u)

        return []
    def dfs(self, adj, u, v, visited):
        visited[u] = True
        if u == v:
            return True

        for ngbr in adj[u]:
            if visited[ngbr]:
                continue
            if self.dfs(adj, ngbr, v, visited):
                return True
        return False
        