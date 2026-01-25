class Spreadsheet:

    def __init__(self, rows: int):
        self.spreadsheet=[[0]*26 for _ in range(rows)]
        

    def setCell(self, cell: str, value: int) -> None:
        col=ord(cell[0])-ord('A')
        row = int(cell[1:]) - 1 
        self.spreadsheet[row][col]=value
        

    def resetCell(self, cell: str) -> None:
        col=ord(cell[0])-ord('A')
        row=int(cell[1:]) - 1
        self.spreadsheet[row][col]=0

        

    def getValue(self, formula: str) -> int:
        s=formula[1:]
        idx=s.index('+')
        return self.solve(s[:idx])+self.solve(s[idx+1:])
    def solve(self,num):
        if num[0].isdigit():
            return int(num)
        col = ord(num[0]) - ord('A')
        row = int(num[1:]) - 1
        return int(self.spreadsheet[row][col])


# Your Spreadsheet object will be instantiated and called as such:
# obj = Spreadsheet(rows)
# obj.setCell(cell,value)
# obj.resetCell(cell)
# param_3 = obj.getValue(formula)