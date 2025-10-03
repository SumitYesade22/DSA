class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int csum=nums[0];
        int msum=nums[0];
        int minsum=nums[0];
        int cminsum=nums[0];
        for(int i=1;i<n;i++){
          csum=Math.max(nums[i],csum+nums[i]);
          msum=Math.max(csum,msum);
          cminsum=Math.min(nums[i],cminsum+nums[i]);
          minsum=Math.min(cminsum,minsum);
        }
        if(msum>Math.abs(minsum)){
            return msum;
        }
        return Math.abs(minsum);
    }
}