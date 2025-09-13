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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode>que=new LinkedList<>();
         if (root == null) return 0;
        que.offer(root);
        int level=0;
        while(true){
            int nodes=que.size();
            
            if(que.isEmpty()){
                return level;
            }
            while(nodes!=0){
                TreeNode n=que.poll();
             if(n.left!=null){
                que.offer(n.left);
            }
            if(n.right!=null){
                que.offer(n.right);
            }
               nodes--;
            }
           
           level++;
        }
        
    }
}