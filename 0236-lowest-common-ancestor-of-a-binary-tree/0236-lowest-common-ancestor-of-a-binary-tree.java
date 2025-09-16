/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode m=lowestCommonAncestor( root.left, p,  q);
        TreeNode n=lowestCommonAncestor( root.right,  p,  q);

        if(m==null){
            return n;
        }else if(n==null){
            return m;
        }else{
            return root;
        }
        
    }
}