# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        list1=[]
        list2=[]
        self.inorder(root1,list1)
        self.inorder(root2,list2)
        return list1==list2
    def inorder(self,root,list):
        if root is None:
            return
        if root.left is None and root.right is None:
            list.append(root.val)
            return
        self.inorder(root.left,list)
        self.inorder(root.right,list)

        