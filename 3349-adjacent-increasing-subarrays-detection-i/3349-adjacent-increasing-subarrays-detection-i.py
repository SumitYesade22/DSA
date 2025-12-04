class Solution:
    def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
        run=1
        prevrun=0
        if len(nums)==2 and k==1:
            return True
        for i in range(1,len(nums)):
            if nums[i]>nums[i-1]:
                run+=1
            else:
                prevrun=run
                run=1

            if run>=2*k:
                return True
            if run>=k and prevrun>=k:
                return True
        return False

        