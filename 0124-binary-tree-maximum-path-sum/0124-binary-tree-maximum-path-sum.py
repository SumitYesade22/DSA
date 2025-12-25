# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return
        self.ans = float('-inf')
        finale=self.solve(root)
        return max(self.ans,finale)
    
    def solve(self,root):
        if root is None:
            return 0
        left=self.solve(root.left)
        right=self.solve(root.right)
        both=left+right+root.val
        one=max(left,right)+root.val
        self.ans=max(self.ans,both,one,root.val)
        return max(one,root.val)
        