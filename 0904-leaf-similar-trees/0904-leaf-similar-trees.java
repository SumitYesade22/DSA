class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        
        collectLeaves(root1, one);
        collectLeaves(root2, two);
        
        return one.equals(two);  
    }

    private void collectLeaves(TreeNode root, List<Integer> list) {
        if (root == null) return;  
        
        if (root.left == null && root.right == null) {
            list.add(root.val);   
        }
        
        collectLeaves(root.left, list);
        collectLeaves(root.right, list);
    }
}
