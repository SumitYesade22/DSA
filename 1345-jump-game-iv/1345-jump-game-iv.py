class Solution:
    def minJumps(self, arr: List[int]) -> int:
        n = len(arr)
        if n == 1:
            return 0
        
        # Build graph mapping: value -> list of indices
        mp = defaultdict(list)
        for i, val in enumerate(arr):
            mp[val].append(i)
            
        que = deque([0])
        visited = [False] * n
        visited[0] = True
        steps = 0
        
        while que:
            size = len(que)
            
            # Process current level (step)
            for _ in range(size):
                curr = que.popleft()
                
                # BFS guarantees the first time we reach destination is the shortest path
                if curr == n - 1:
                    return steps
                
                # Option 1: Move left
                left = curr - 1
                if left >= 0 and not visited[left]:
                    que.append(left)
                    visited[left] = True
                    
                # Option 2: Move right
                right = curr + 1
                if right < n and not visited[right]:
                    que.append(right)
                    visited[right] = True
                    
                # Option 3: Jump to identical values
                if arr[curr] in mp:
                    for idx in mp[arr[curr]]:
                        if not visited[idx]:
                            que.append(idx)
                            visited[idx] = True
                    # Erase from map to prevent redundant lookups and avoid TLE
                    del mp[arr[curr]]
                    
            steps += 1
            
        return -1
        