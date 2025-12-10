class Solution:
    def maxUncrossedLines(self, nums1: List[int], nums2: List[int]) -> int:
        dp=[[-1]*len(nums2) for i in range(len(nums1))]
        ans=self.solve(nums1,nums2,0,0,dp)
        return ans
    def solve(self,nums1,nums2,i,j,dp):
        if i>=len(nums1) or j>=len(nums2):
            return 0
        if dp[i][j]!=-1:
            return dp[i][j]
        if nums1[i]==nums2[j]:
            dp[i][j]=1+self.solve(nums1,nums2,i+1,j+1,dp)
        else:
             dp[i][j]=max(self.solve(nums1,nums2,i+1,j,dp),self.solve(nums1,nums2,i,j+1,dp))
        return dp[i][j]