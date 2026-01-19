class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        ans=[]
        s=set()
        n=len(grid)
        for i in range(n):
            for j in range(n):
                if grid[i][j] in s:
                    ans.append(grid[i][j])
                else:
                    s.add(grid[i][j])
        for i in range(1,(n*n)+1):
            if i in s:
                continue
            else:
                ans.append(i)
        return ans
        