class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }

    public int solve(int[] nums, int target, int st, int sum) {
        if (st == nums.length) {
            return (sum == target) ? 1 : 0;
        }

     
        int add = solve(nums, target, st + 1, sum + nums[st]);

        
        int subtract = solve(nums, target, st + 1, sum - nums[st]);

        return add + subtract;
    }
}
