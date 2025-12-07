class Solution:
    def jump(self, nums: List[int]) -> int:
        coverage=0
        lastjump=0
        jumps=0
        for i in range(len(nums)-1):
            coverage=max(coverage,nums[i]+i)
            if i==lastjump:
                jumps+=1
                lastjump=coverage
            if len(nums)-1<=lastjump:
                return jumps
        return jumps

