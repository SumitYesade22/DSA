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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        int sum=0;
        List<Integer>res=new ArrayList<>();
        recursion(root,ans,res,sum,targetSum);
        return ans;
        
    }
    public void recursion(TreeNode root,List<List<Integer>>ans,List<Integer>res,int sum,int targetSum){
        if(root==null){
            return;
        }
        sum+=root.val;
        // if(sum>targetSum){
        //     return;
        // }
        res.add(root.val);
        recursion(root.left,ans,res,sum,targetSum);
        recursion(root.right,ans,res,sum,targetSum);
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(res));
            }
        }
        res.remove(res.size()-1);

    }
}










