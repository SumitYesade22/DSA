# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        if root is None:
            return ans
        self.preorder(ans,root)
        return ans
    def preorder(self,ans,root):
        if root is None:
            return 
        ans.append(root.val)
        self.preorder(ans,root.left)
        self.preorder(ans,root.right)
        