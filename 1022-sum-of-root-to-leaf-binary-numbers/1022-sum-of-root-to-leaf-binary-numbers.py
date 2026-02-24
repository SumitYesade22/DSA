# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        self.nums=[]
        self.dfs(root,"")
        sum=0
        for num in self.nums:
            sum+=num
        return sum
    def dfs(self,root,s):
        if root is None:
            return
        if root.left is None and root.right is None:
            s+=str(root.val)
            self.nums.append(int(s,2))
            return
        if root.left is not None:
            self.dfs(root.left,s+str(root.val))
        if root.right is not None:
            self.dfs(root.right,s+str(root.val))
        