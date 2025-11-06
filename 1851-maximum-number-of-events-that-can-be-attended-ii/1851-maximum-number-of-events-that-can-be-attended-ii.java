
class Solution {
    int[][] dp;
    
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int n = events.length;
        dp = new int[n + 1][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        
        return solve(0, events, k);
    }

    private int solve(int i, int[][] events, int k) {
        if (k == 0 || i >= events.length) return 0;
        if (dp[i][k] != -1) return dp[i][k];

      
        int next = nextEvent(events, events[i][1]);

        int take = events[i][2] + solve(next, events, k - 1);
        int skip = solve(i + 1, events, k);

        return dp[i][k] = Math.max(take, skip);
    }

    private int nextEvent(int[][] events, int endTime) {
        int l = 0, r = events.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (events[mid][0] <= endTime) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
