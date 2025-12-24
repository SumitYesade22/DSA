# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
         if not subRoot:
            return True
         if not root:
            return False

         sub_pre = []
         self.solve(subRoot, sub_pre)

         return self.dfs(root, sub_pre)

    def solve(self, root, pre):
        if root is None:
            pre.append(None)
            return

        pre.append(root.val)
        self.solve(root.left, pre)
        self.solve(root.right, pre)

    def dfs(self, root, sub_pre):
        if root is None:
            return False

        temp = []
        self.solve(root, temp)

        if temp == sub_pre:
            return True

        return self.dfs(root.left, sub_pre) or self.dfs(root.right, sub_pre)
        