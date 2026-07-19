class Solution:
    def findDegrees(self, matrix: list[list[int]]) -> list[int]:
        ans=[]
        for num in matrix:
            ans.append(sum(num))

        return ans
        