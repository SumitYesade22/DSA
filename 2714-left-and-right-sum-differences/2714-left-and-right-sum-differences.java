class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int n=nums.length;
        int l=0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            sum-=nums[i];
         ans[i]=Math.abs(l-sum);
         l+=nums[i];
        }
     return ans;   
    }
}