# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return root
        self.sum=0
        self.solve(root)
        return root
    def solve(self,root):
        if root is None:
            return
        self.solve(root.right)
        self.sum+=root.val
        root.val=self.sum
        self.solve(root.left)