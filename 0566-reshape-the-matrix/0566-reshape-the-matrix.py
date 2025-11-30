class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        ans=[[0]*c for i in range(r)]
        if len(mat)*len(mat[0])!=r*c:
            return mat
        row=0
        col=0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                ans[row][col]=mat[i][j]
                col+=1
                if(col==c):
                    col=0
                    row+=1

        return ans