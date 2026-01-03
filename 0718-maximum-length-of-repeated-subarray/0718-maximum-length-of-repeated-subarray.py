class Solution:
    def findLength(self, nums1: List[int], nums2: List[int]) -> int:
        row=len(nums1)+1
        col=len(nums2)+1
        ans=float('-inf')
        dp=[[0]*col for i in range(row)]
        for i in range(1,row):
            for j in range(1,col):
                if nums1[i-1]==nums2[j-1]:
                    dp[i][j]=dp[i-1][j-1]+1
                ans=max(ans,dp[i][j])
        return ans
                

        