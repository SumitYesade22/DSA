# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        queue=deque([root])
        while queue:
            size=len(queue)
            sum=0
            for i in range(size):
                node=queue.popleft()
                sum+=node.val
                if node.right:
                    queue.append(node.right)
                if node.left:
                    queue.append(node.left)
        return sum

        