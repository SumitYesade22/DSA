# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        self.ans=0
        self.solve(root,"")
        return self.ans
    def solve(self,root,temp):
        if root is None:
            return 
        if root.left is None and root.right is None:
            self.ans=self.ans+int(temp+str(root.val))
            return 
        self.solve(root.left,temp+str(root.val))
        self.solve(root.right,temp+str(root.val))
        