# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: Optional[TreeNode]) -> int:
        self.sum = 0
        self.dfs(root, None, None)
        return self.sum

    def dfs(self, node, parent, grandparent):
        if not node:
            return

        if grandparent is not None and grandparent % 2 == 0:
            self.sum += node.val

        self.dfs(node.left, node.val, parent)
        self.dfs(node.right, node.val, parent)