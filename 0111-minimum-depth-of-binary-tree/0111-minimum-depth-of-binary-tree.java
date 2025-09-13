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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        int level=0;
        while(true){
           int nodes=que.size();
           while(nodes!=0){
            TreeNode n=que.poll();
            if(n.left!=null){
                que.offer(n.left);
            }
            if(n.right!=null){
                que.offer(n.right);
            }
            if(n.right==null && n.left==null){
                return level+1;
            }
            nodes--;
           }
            level++;
        }

        
    }
}