class Solution {
    final int MOD = 1000000007;
    Integer[][] dp;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        dp = new Integer[locations.length][fuel + 1];
        return solve(locations, start, finish, fuel);
    }

    public int solve(int[] locations, int start, int finish, int fuel) {

        if (fuel < 0) return 0;  

        if (dp[start][fuel] != null)
            return dp[start][fuel];

        int ways = (start == finish) ? 1 : 0;

        for (int next = 0; next < locations.length; next++) {
            if (next == start) continue;

            int cost = Math.abs(locations[start] - locations[next]);

            ways = (ways + solve(locations, next, finish, fuel - cost)) % MOD;
        }

        return dp[start][fuel] = ways;
    }
}
