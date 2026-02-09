# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        arr=[]
        self.inorder(root,arr)
        root=self.solve(arr,0,len(arr)-1)
        return root
    def inorder(self,root,arr):
        if root is None:
            return
        self.inorder(root.left,arr)
        arr.append(root.val)
        self.inorder(root.right,arr)
    def solve(self,arr,i,j):
        if i>j:
            return None
        mid=i+(j-i)//2
        root=TreeNode(arr[mid])
        root.left=self.solve(arr,i,mid-1)
        root.right=self.solve(arr,mid+1,j)
        return root
        