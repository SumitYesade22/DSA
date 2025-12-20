# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0 
        dif=self.solve(root,root.val,root.val)
        return dif
    def solve(self,root,intmin,intmax):
        if root is None:
            return abs(intmax-intmin)
        intmax=max(intmax,root.val)
        intmin=min(intmin,root.val)
        dif1=self.solve(root.left,intmin,intmax)
        dif2=self.solve(root.right,intmin,intmax)
        return max(dif1,dif2)
        