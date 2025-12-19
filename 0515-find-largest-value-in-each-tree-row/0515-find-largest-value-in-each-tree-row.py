# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        res=[]
        if root is None:
            return res
        queue=deque([root])
        while queue:
            maxi=-20**8
            size=len(queue)
            for i in range(size):
                node=queue.popleft()
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                maxi=max(maxi,node.val)
            res.append(maxi)
        return res
                
        