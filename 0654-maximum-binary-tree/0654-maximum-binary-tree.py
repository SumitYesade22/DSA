# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        if len(nums)==0:
            return None
        root=self.solve(nums,0,len(nums)-1)
        return root
    def solve(self,nums,start,end):
        if start>end:
            return None
        m=nums[start]
        idx=start
        for i in range(start+1,end+1,1):
            if nums[i]>m:
                m=nums[i]
                idx=i
        root=TreeNode(nums[idx])
        root.left=self.solve(nums,start,idx-1)
        root.right=self.solve(nums,idx+1,end)
        return root

            
        
        