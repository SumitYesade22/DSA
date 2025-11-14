class Solution {
    int[][] memo;
    int OFFSET = 20000;   // maximum difference range is [-20000, +20000]
    int n;

    public boolean canPartition(int[] nums) {
        n = nums.length;

        memo = new int[n][40001]; // diff + OFFSET index
        for (int i = 0; i < n; i++)
            java.util.Arrays.fill(memo[i], Integer.MIN_VALUE);

        int ans = solve(nums, 0, 0);
        return ans >= 0;   // if diff == 0 achievable
    }

    public int solve(int[] nums, int i, int diff) {
        if (i == n) {
            if (diff == 0) return 0;     // valid balanced partition
            return Integer.MIN_VALUE/2;  // invalid
        }

        if (memo[i][diff + OFFSET] != Integer.MIN_VALUE)
            return memo[i][diff + OFFSET];

        // put nums[i] on left pile
        int left = nums[i] + solve(nums, i + 1, diff + nums[i]);

        // put nums[i] on right pile
        int right = nums[i] + solve(nums, i + 1, diff - nums[i]);

        int best = Math.max(left, right);

        return memo[i][diff + OFFSET] = best;
    }
}
