class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x:x[1])
        cr=0
        prev=intervals[0][1]
        for i in range(len(intervals)-1):
            if prev>intervals[i+1][0]:
                cr+=1
                continue
            prev=intervals[i+1][1]

        return cr


        