class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        for(int n:nums){
            sum+=n;
        }
        int s=0;
        long r=0;
        for(int i=0;i<nums.length-1;i++){
            sum-=nums[i];
            r+=nums[i];
            if(r>=sum){
                s++;
            }


        }
        return s;
    }
}