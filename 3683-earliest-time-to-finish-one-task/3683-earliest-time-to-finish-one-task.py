class Solution:
    def earliestTime(self, tasks: List[List[int]]) -> int:
        lst=[]
        for rows in tasks:
            num1=rows[0]+rows[1]
            lst.append(num1)
        lst.sort()
        return lst[0]
        