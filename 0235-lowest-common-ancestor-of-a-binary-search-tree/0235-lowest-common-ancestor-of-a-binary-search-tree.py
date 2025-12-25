# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None:
            return None
        ans=self.solve(root,p,q)
        return ans
    def solve(self,root,p,q):
        if root is None:
            return
        if root==p:
            return p
        if root==q:
            return q
        left=self.solve(root.left,p,q)
        right=self.solve(root.right,p,q)
        if left and right:
            return root
        if left is not None:
            return left
        if right is not None:
            return right
        
        