# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        
        hashmap = {}
        self.inorder(root, hashmap)
        
        max_freq = max(hashmap.values())
        
        # Collect all values with max frequency
        return [key for key, freq in hashmap.items() if freq == max_freq]

    def inorder(self, node, hashmap):
        if not node:
            return
        
        self.inorder(node.left, hashmap)
        
        hashmap[node.val] = hashmap.get(node.val, 0) + 1
        
        self.inorder(node.right, hashmap)
     
    
        