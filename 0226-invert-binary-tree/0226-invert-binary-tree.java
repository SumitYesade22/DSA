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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
        int nodes=que.size();
        while(nodes!=0){
            TreeNode n=que.poll();
            if(n.left!=null){
                que.offer(n.left);
                
            }
            if(n.right!=null){
                que.offer(n.right);
                
            }
            TreeNode temp=n.right;
            n.right=n.left;
            n.left=temp;
            nodes--;
        }

        }
       return root; 
    }
}