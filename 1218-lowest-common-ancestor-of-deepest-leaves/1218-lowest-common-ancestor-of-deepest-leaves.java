class Solution {
    int maxdp = Integer.MIN_VALUE;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        depth(root, map, 0);

        List<TreeNode> deepest = new ArrayList<>();
        for (Map.Entry<TreeNode, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxdp) deepest.add(entry.getKey());
        }

        if (deepest.isEmpty()) return null;
        TreeNode cur = deepest.get(0);
        for (int i = 1; i < deepest.size(); i++) {
            cur = lca(root, cur, deepest.get(i)); // fold LCA across all deepest nodes
        }
        return cur;
    }

    private void depth(TreeNode root, Map<TreeNode, Integer> map, int d) {
        if (root == null) return;
        map.put(root, d);           // store node, not value
        maxdp = Math.max(maxdp, d);
        depth(root.left, map, d + 1);
        depth(root.right, map, d + 1);
    }

    private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
