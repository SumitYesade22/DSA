class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> res = new LinkedList<>();
        if (root == null) {
            return false;
        }
        res.offer(root);
        while (!res.isEmpty()) {
            int c = res.size();
            int e = 0;   
            while (c != 0) {
                TreeNode n = res.poll();
                
               
                if (n.left != null && n.right != null) {
                    if ((n.left.val == x && n.right.val == y) || 
                        (n.left.val == y && n.right.val == x)) {
                        return false;
                    }
                }

                if (n.val == x || n.val == y) {
                    e++;
                }
                if (n.left != null) {
                    res.offer(n.left);
                }
                if (n.right != null) {
                    res.offer(n.right);
                }

                c--;
            }
            if (e == 2) {   
                return true;
            }
        }
        return false;
    }
}
