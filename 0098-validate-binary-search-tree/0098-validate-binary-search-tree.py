# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        self.prev=None
        return self.inorder(root)
    def inorder(self,root):
        if root is None:
            return True 
        leftans=self.inorder(root.left)
        if leftans is False:
            return False
        if self.prev is not None and self.prev>=root.val:
            return False
        self.prev=root.val
        return self.inorder(root.right)
        

        