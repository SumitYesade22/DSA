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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            m.put(inorder[i],i);
        }
        TreeNode root=built(preorder,m,0,inorder.length-1,0);
        return root;
    }
    public TreeNode built(int[] preorder,HashMap<Integer,Integer>m,int left,int right,int rootIndex){
        TreeNode root=new TreeNode(preorder[rootIndex]);
        int mid=m.get(preorder[rootIndex]);
        if(left<mid){
          root.left=built(preorder,m,left,mid-1,rootIndex+1);
        }
        if(right>mid){
        root.right=built(preorder,m,mid+1,right,rootIndex+mid-left+1);
     
        }


return root;


    }
}