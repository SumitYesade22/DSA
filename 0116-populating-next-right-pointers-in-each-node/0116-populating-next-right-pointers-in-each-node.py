"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if root is None:
            return
        queue=deque()
        queue.append(root)
        while queue:
            n=len(queue)
          
            while n!=0:
                node=queue.popleft()
                if n==1:
                    node.next = None
                else:
                    node.next=queue[0]
                n-=1
                if node.left is not None:
                    queue.append(node.left)
                if node.right is not None:
                    queue.append(node.right)

        return root




        
        