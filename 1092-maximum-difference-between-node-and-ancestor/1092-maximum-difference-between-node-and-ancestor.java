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
    public int maxAncestorDiff(TreeNode root) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(root==null){
            return 0;
        }
        int dif=recursion(root,min,max);
        return dif;

    }
    public int recursion(TreeNode root,int min,int max){
        if(root==null){
            return Math.abs(min-max);
        }
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);

        int dif1=recursion(root.left,min,max);
        int dif2=recursion(root.right,min,max);

        return Math.max(dif1,dif2);
    }
}