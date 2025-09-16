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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        Queue<TreeNode>que=new LinkedList<>();
        que.offer(root);
        int l=0;
        int as=0;
        while(!que.isEmpty()){
            int s=que.size();
            int sum=0;
            l++;
        while(s!=0){
            TreeNode temp=que.poll();
            
            sum+=temp.val;
            s--;
            if(temp.left!=null){
                que.offer(temp.left);
            } 
            if(temp.right!=null){
                que.offer(temp.right);
            } 
             
        }
     
        if(max<sum){
            max=sum;
               as=l;
            } 
        }
        
     return as;   
    }
}