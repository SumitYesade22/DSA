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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        } 
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
       
        while(!que.isEmpty()){
            int s=que.size();
            List<Integer>inter=new ArrayList<>();
            while(s!=0){
                TreeNode temp=que.poll();
                inter.add(temp.val);
                if(temp.left!=null){
                    que.offer(temp.left);
                }
                if(temp.right!=null){
                    que.offer(temp.right);
                }
                s--;

            }
            ans.add(inter);
        }
     return ans;   
    }
}