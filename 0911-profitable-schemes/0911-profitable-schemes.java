class Solution {
    static final int MOD = 1000000007;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int len = group.length;
        
        int[][][] dp = new int[len + 1][n + 1][minProfit + 1];
        for (int i = 0; i <= len; i++)
            for (int j = 0; j <= n; j++)
                for (int k = 0; k <= minProfit; k++)
                    dp[i][j][k] = -1;

        return solve(n, minProfit, group, profit, 0, 0, dp);
    }

    public int solve(int n, int minProfit, int[] group, int[] profit, int st, int cp, int[][][] dp) {
        if (st == group.length)
            return cp >= minProfit ? 1 : 0;

        if (dp[st][n][cp] != -1) return dp[st][n][cp];

        
        int skip = solve(n, minProfit, group, profit, st + 1, cp, dp);

       
        int take = 0;
        if (n >= group[st]) {
            int newProfit = Math.min(minProfit, cp + profit[st]);
            take = solve(n - group[st], minProfit, group, profit, st + 1, newProfit, dp);
        }

        dp[st][n][cp] = (take + skip) % MOD;
        return dp[st][n][cp];
    }
}
