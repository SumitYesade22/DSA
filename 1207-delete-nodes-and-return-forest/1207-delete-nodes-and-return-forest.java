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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer>value=new HashSet<>();
        for(int n:to_delete){
            value.add(n);
        }
        List<TreeNode>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        recursion(ans,root,value);
         if (!value.contains(root.val)) {
            ans.add(root);
        }
        return ans;
        
    }
    public TreeNode recursion(List<TreeNode>ans,TreeNode root,Set<Integer>value){
        if(root==null){
            return null;
        }
       root.left= recursion(ans,root.left,value);
        root.right=recursion(ans,root.right,value);

        if(value.contains(root.val)){
            if(root.left!=null){
                ans.add(root.left);
            }
            if(root.right!=null){
                ans.add(root.right);
            }
            return null;
        }else{
            return root;
        }
    }
}