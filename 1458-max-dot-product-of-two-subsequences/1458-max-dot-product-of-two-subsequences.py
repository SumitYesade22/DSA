class Solution:
    def maxDotProduct(self, nums1: List[int], nums2: List[int]) -> int:
        self.m=len(nums1)
        self.n=len(nums2)
        self.inf=-10000000
        self.t=[[self.inf]*500 for i in range(500)]
        ans=self.solve(nums1,nums2,0,0)
        return ans
    def solve(self,nums1,nums2,i,j):
        if i>=self.m or j>=self.n:
            return self.inf
        if self.t[i][j]!=self.inf:
            return self.t[i][j]
        val=nums1[i]*nums2[j]
        takeij=val+self.solve(nums1,nums2,i+1,j+1)
        takei=self.solve(nums1,nums2,i,j+1)
        takej=self.solve(nums1,nums2,i+1,j)
        self.t[i][j]=max(val,takeij,takei,takej)
        return self.t[i][j]
        