class Solution:
    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
        rows=len(grid)
        cols=len(grid[0])
        rowsum=[0]*rows
        total=0
        colsum=[0]*cols
        for i in range(rows):
            for j in range(cols):
                rowsum[i]+=grid[i][j]
                colsum[j]+=grid[i][j]
                total+=grid[i][j]
        if total%2!=0:
            return False
        upper=0
        for i in range(rows-1):
            upper+=rowsum[i]
            if upper==total-upper:
                return True
        upper=0
        for i in range(cols-1):
            upper+=colsum[i]
            if upper==total-upper:
                return True
        return False
                