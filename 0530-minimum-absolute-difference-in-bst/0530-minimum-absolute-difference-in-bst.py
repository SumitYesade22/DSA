# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        List=[]
        self.inorder(List,root)
        mindif=10**8
        for i in range(1,len(List)):
            mindif=min(mindif,List[i]-List[i-1])
        return mindif
    def inorder(self,List,root):
        if root is None:
            return
        self.inorder(List,root.left)
        List.append(root.val)
        self.inorder(List,root.right)
        