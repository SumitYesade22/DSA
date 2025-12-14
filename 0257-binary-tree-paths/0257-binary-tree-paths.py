# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        res=[]
        if root is None:
            return res
        self.paths(root,"",res)
        return res
    def paths(self,root,path,res):
        if root is None:
            return 
        if path=="":
            path=str(root.val)
        else:
            path=path+"->"+str(root.val)
        if root.left is None and root.right is None:
            res.append(path)
            return 
       
        self.paths(root.left,path,res)
        self.paths(root.right,path,res)