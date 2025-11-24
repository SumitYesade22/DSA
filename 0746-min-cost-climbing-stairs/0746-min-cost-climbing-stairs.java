
class Solution {
    int rec(int i, int[] cost, int[] memo) {
        if (i <= 1) return 0;
        if (memo[i] != -1) return memo[i];

        int oneStep = rec(i - 1, cost, memo) + cost[i - 1];
        int twoStep = rec(i - 2, cost, memo) + cost[i - 2];

        return memo[i] = Math.min(oneStep, twoStep);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = memo[1] = 0;
        return rec(n, cost, memo);
    }
}