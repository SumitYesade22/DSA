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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return 0;
        }
        inorder(root,ans);
        return ans.get(k-1);
        
    }
    public void inorder(TreeNode root,List<Integer>ans){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorder(root.left,ans);
        }
        ans.add(root.val);
        if(root.right!=null){
            inorder(root.right,ans);
        }
    }
}