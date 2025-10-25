class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        int cmaxSum = nums[0];
        int cminSum = nums[0];

        for (int i = 1; i < n; i++) {
            sum += nums[i];

           
            cmaxSum = Math.max(nums[i], cmaxSum + nums[i]);
            cminSum = Math.min(nums[i], cminSum + nums[i]);

            maxSum = Math.max(maxSum, cmaxSum);
            minSum = Math.min(minSum, cminSum);
        }

        if (maxSum > 0)
            return Math.max(maxSum, sum - minSum);

        return maxSum;
    }
}
