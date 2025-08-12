class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ;
        int n = nums.length;
        for(int num : nums){
        sum+=num;
        }
        int sum1 = n*(n+1)/2;
        int ans= sum1-sum;
        return ans;

        
    }
}