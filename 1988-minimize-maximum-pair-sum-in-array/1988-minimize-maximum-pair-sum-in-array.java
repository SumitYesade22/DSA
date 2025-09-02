class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int ed=nums.length-1;
        int maxNum=Integer.MIN_VALUE;
        
        while(st<ed){
        int sum=nums[st]+nums[ed];
        maxNum=Math.max(maxNum,sum);
        st++;
        ed--;
        }
      return maxNum;  
    }
}