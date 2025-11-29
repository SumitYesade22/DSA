class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        res=[[1]]
        for _ in range(numRows-1):
            dummy=res[-1]
            dummy=[0]+res[-1]+[0]
            row=[]
            for i in range(len(dummy)-1):
                row.append(dummy[i]+dummy[i+1])
            res.append(row)
        return res
