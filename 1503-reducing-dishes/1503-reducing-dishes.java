class Solution {
    int n;
    int[][] dp;

    public int maxSatisfaction(int[] satisfaction) {
     
        Arrays.sort(satisfaction);
        n = satisfaction.length;

     
        dp = new int[n + 1][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        
        return solve(satisfaction, 0, 1);
    }

    
    private int solve(int[] satisfaction, int i, int time) {
        
        if (i == n)
            return 0;

        if (dp[i][time] != -1)
            return dp[i][time];

        
        int include = satisfaction[i] * time + solve(satisfaction, i + 1, time + 1);

      
        int exclude = solve(satisfaction, i + 1, time);

        
        dp[i][time] = Math.max(include, exclude);

        return dp[i][time];
    }
}