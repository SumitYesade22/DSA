# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        mp={}
        for i in range(len(preorder)):
            mp[inorder[i]]=i
        root=self.built(mp,inorder,preorder,0,0,len(inorder)-1)
        return root
    def built(self,mp,inorder,preorder,rootindex,left,right):
        root=TreeNode(preorder[rootindex])
        mid=mp.get(preorder[rootindex])
        if left<mid:
            root.left=self.built(mp,inorder,preorder,rootindex+1,left,mid-1)
        if mid<right:
            root.right=self.built(mp,inorder,preorder,rootindex+1+mid-left,mid+1,right)
        return root