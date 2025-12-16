# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        res=[]
        self.solve(res,root)
        return res[k-1]
        
    def solve(self,res,root):
        if root is None:
            return 
        if root.left:
            self.solve(res,root.left)
        res.append(root.val)
        if root.right:
            self.solve(res,root.right)