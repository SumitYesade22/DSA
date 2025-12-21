# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        l=0
        ans=0
        s=-20**8
        queue=deque([root])
        while queue:
            size=len(queue)
            temp=0
            l+=1
            for i in range(size):
                node=queue.popleft()
                temp+=node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if s<temp:
                s=temp
                ans=l
        return ans

            

        