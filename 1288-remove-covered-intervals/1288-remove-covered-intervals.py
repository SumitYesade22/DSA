class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:
        sorted_nums=sorted(intervals,key=lambda x:(x[0],-x[1]))
        ans=[]
        ans.append(sorted_nums[0])
        for i in range(1,len(intervals)):
            if ans[-1][0]<=sorted_nums[i][0] and ans[-1][1]>=sorted_nums[i][1]:
                continue
            ans.append(sorted_nums[i])
        return len(ans)
        