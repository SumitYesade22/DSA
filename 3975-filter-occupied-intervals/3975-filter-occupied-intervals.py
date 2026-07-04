from typing import List

class Solution:
    def filterOccupiedIntervals(self, occupiedIntervals: List[List[int]], freeStart: int, freeEnd: int) -> List[List[int]]:
        if not occupiedIntervals:
            return []
        
        # Step 1: Sort and standard interval merging (handling touching intervals)
        occupiedIntervals.sort()
        merged = [occupiedIntervals[0]]
        
        for i in range(1, len(occupiedIntervals)):
            curr_start, curr_end = occupiedIntervals[i]
            prev_start, prev_end = merged[-1]
            
            # They overlap or touch if current start is <= previous end + 1
            if curr_start <= prev_end + 1:
                merged[-1][1] = max(prev_end, curr_end)
            else:
                merged.append([curr_start, curr_end])
                
        # Step 2: Filter out the free interval points
        result = []
        for start, end in merged:
            # Case 1: No overlap at all (Interval is entirely before or after free period)
            if end < freeStart or start > freeEnd:
                result.append([start, end])
                
            # Case 2: Full inner overlap (Free period splits the occupied interval in two)
            elif start < freeStart and end > freeEnd:
                result.append([start, freeStart - 1])
                result.append([freeEnd + 1, end])
                
            # Case 3: Partial or full outer overlap
            else:
                # Left remaining slice
                if start < freeStart:
                    result.append([start, freeStart - 1])
                # Right remaining slice
                if end > freeEnd:
                    result.append([freeEnd + 1, end])
                    
        return result
