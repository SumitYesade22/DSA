class Solution {
    int K;
    Integer[] dp;

    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        dp = new Integer[n];
        K = k;

        int finale = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            finale = Math.max(finale, solve(energy, i));
        }

        return finale;
    }

    public int solve(int[] energy, int i) {
        if (i >= energy.length) return 0;
        if (dp[i] != null) return dp[i];

        dp[i] = energy[i] + solve(energy, i + K);
        return dp[i];
    }
}
