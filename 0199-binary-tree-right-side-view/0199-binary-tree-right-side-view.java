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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>que=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        que.offer(root);
        while(!que.isEmpty()){
            int s=que.size();
            TreeNode node=null;
            for(int i=0;i<s;i++){
                 node = que.poll();
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
            res.add(node.val);
        }
      return res;  
    }
}