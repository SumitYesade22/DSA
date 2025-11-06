class Solution {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long temp1 = 1L * nums[n - 1] * nums[n - 2] * nums[n - 3];
        long temp2 = 1L * nums[0] * nums[1] * nums[n - 1];
        long ans = Math.max(temp1, temp2);
        int[] temp = {-100000, 100000};
        for(int val : temp) {
            long option1 = 1L * val * nums[n - 1] * nums[n - 2];
            long option2 = 1L * val * nums[0] * nums[1];
            long option3 = 1L * val * nums[0] * nums[n - 1];
            ans = Math.max(ans, Math.max(option1, Math.max(option2, option3)));
        }
        return ans;
    }
}