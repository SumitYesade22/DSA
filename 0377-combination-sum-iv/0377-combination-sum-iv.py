class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        self.dp = [-1]*(target + 1)
        ans=self.solve(nums,target)
        return ans
    def solve(self,nums,target):
        if target==0:
            return 1
        if target<0:
            return 0
        if self.dp[target] != -1:
            return self.dp[target]
        
        ans=0
        for i in range(len(nums)):
            ans+=self.solve(nums,target-nums[i])
        self.dp[target] = ans
        return ans
            
        