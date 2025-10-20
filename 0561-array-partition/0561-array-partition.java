class Solution {
    public int arrayPairSum(int[] nums) {
        int max=0;
        int n=nums.length;
        int i=0;
        int j=n-1;
        Arrays.sort(nums);
       while(i<n){
        max+=nums[i];
        i=i+2;
       }
       return max;
    }
}