/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null){
            return 0;
        }
       
        inorder(root,l);
          int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < l.size(); i++) {
            minDiff = Math.min(minDiff, l.get(i) - l.get(i - 1));
        }
        return minDiff;
        
    }
    public void inorder(TreeNode root,List<Integer>l){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            inorder(root.left,l);
        }
        l.add(root.val);
        if(root.right!=null){
            inorder(root.right,l);
        }
    }
}