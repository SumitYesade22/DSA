# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        if root.val==0:
            return False
        if root.val==1:
            return True
        left=False
        right=False
        if root.left is not None:
            left=self.evaluateTree(root.left)
        if root.right is not None:
            right=self.evaluateTree(root.right)
        if root.val==2:
            return left or right
        else:
            return left and right
        