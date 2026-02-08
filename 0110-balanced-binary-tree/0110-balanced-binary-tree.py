# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        ans=self.solve(root)
        return ans
    def solve(self,root):
        if root is None:
            return True
        left=self.height(root.left)
        right=self.height(root.right)
        if abs(left-right)>1:
            return False
        else:
            return self.solve(root.left) & self.solve(root.right)
    def height(self,root):
        if root is None:
            return 0
        lft=1+self.height(root.left)
        rght=1+self.height(root.right)
        return max(lft,rght)
       