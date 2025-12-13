# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        self.ans=[]
        self.traversal(root)
        return self.ans
    def traversal(self,root):
        if root is None:
            return 
        self.traversal(root.left)
        self.ans.append(root.val)
        self.traversal(root.right)
        