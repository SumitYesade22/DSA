# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:

    def serialize(self, root):
        if root is None:
            return ""
        res = []
        queue = deque([root])
        
        while queue:
            node = queue.popleft()
            if node:
                res.append(str(node.val))
                queue.append(node.left)
                queue.append(node.right)
            else:
                res.append('#')
        
        return ",".join(res)


    def deserialize(self, data):
        if len(data) == 0:
            return None
        
        values = data.split(",")
        root = TreeNode(int(values[0]))  # FIX 1
        queue = deque([root])
        i = 1
        
        while queue:
            node = queue.popleft()
            
            # left child
            if values[i] != "#":
                node.left = TreeNode(int(values[i]))
                queue.append(node.left)
            i += 1
            
            # right child
            if values[i] != "#":
                node.right = TreeNode(int(values[i]))
                queue.append(node.right)
            i += 1
        
        return root