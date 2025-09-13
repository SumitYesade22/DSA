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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
       int start=0;
       int end=nums.length-1;
       int mid=start+(end-start)/2;
       TreeNode root=new TreeNode(nums[mid]);
       root.left=findans(nums,start,mid-1);
       root.right=findans(nums,mid+1,end);   
       return root;   
    }
    public TreeNode findans(int nums[],int start,int end){
       int st=start;
       int ed=end;
       if(st>ed){
        return null;
       }
       int mid=st+(ed-st)/2;
       TreeNode root=new TreeNode(nums[mid]);
       root.left=findans(nums,st,mid-1);
       root.right=findans(nums,mid+1,ed); 
       return root;

    }
}