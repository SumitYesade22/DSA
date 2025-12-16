# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        if root is None:
            return []
        self.res=[]
        self.solve(root,targetSum,[])
        return self.res
    def solve(self,root,targetSum,temp):
        if root is None:
            return 
        if root.left is None and root.right is None:
            if targetSum-root.val==0:
                temp.append(root.val)
                self.res.append(temp.copy())
                temp.pop()
                return 
        temp.append(root.val)
        if root.left:
            self.solve(root.left,targetSum-root.val,temp)
        if root.right:
            self.solve(root.right,targetSum-root.val,temp)
        temp.pop()
        

        