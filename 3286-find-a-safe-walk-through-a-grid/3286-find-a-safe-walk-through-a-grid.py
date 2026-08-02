class Solution:
    def findSafeWalk(self, grid: List[List[int]], health: int) -> bool:
        m, n = len(grid), len(grid[0])
        
        result = [[float('inf')] * n for _ in range(m)]
        
        dq = deque()
        
        result[0][0] = grid[0][0]
        dq.appendleft((0, 0)) 
        
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        
        while dq:
            r, c = dq.popleft() 
            
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                
                if 0 <= nr < m and 0 <= nc < n:
                    if result[r][c] + grid[nr][nc] < result[nr][nc]:
                        result[nr][nc] = result[r][c] + grid[nr][nc] 
            
                        if grid[nr][nc] == 0:
                            dq.appendleft((nr, nc))
                        else:
                            dq.append((nr, nc))
                            
        return health - result[m-1][n-1] >= 1
