class Solution {
    int ans;
    int L, H;
    int Z, O;
    final int M = 1_000_000_007;
    int[] dp;

    private int solve(int l) {
        if (l > H) {
            return 0;
        }

        if (dp[l] != -1) {
            return dp[l];
        }

        boolean addOne = false;
        if (l >= L && l <= H) {
            addOne = true;
        }

        int takeZero = solve(l + Z);
        int takeOne = solve(l + O);

        dp[l] = (addOne ? 1 : 0) + takeZero + takeOne;
        dp[l] %= M;

        return dp[l];
    }

    public int countGoodStrings(int low, int high, int zero, int one) {
        L = low;
        H = high;
        Z = zero;
        O = one;

        dp = new int[H + 1];
        Arrays.fill(dp, -1);

        return solve(0);
    }
}
