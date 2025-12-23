# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:
        if root is None:
            return 0
        self.ans=0
        self.solve(root)
        return self.ans
    def solve(self,root):
        if root is None:
            return (0,0)
        leftsum,left=self.solve(root.left)
        rightsum,right=self.solve(root.right)
        totalsum=leftsum+rightsum+root.val
        totalnum=left+right+1
        avg=totalsum//totalnum
        if avg==root.val:
            self.ans+=1
        return (totalsum,totalnum)
