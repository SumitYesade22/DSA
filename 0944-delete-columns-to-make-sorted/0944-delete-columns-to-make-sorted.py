class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        row=len(strs)
        col=len(strs[0])
        count=0
        for i in range(col):
            for j in range(1,row):
                if strs[j][i]<strs[j-1][i]:
                    count+=1
                    break
        return count
