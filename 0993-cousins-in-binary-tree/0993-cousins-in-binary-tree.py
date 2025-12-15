# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        queue=deque([root])
        while queue:
            size=len(queue)
            e=0
            while size!=0:
                size-=1
                node=queue.popleft()
                if node.left is not None and node.right is not None:
                    if (node.left.val==x and node.right.val==y) or (node.left.val==y and node.right.val==x):
                        return False
                if node.val==x or node.val==y:
                    e+=1
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                if e==2:
                    return True
        return False
                


        