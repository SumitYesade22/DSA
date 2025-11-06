
class Solution {
    int[] dp;
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

       
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        
        dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, jobs);
    }

    private int solve(int i, int[][] jobs) {
        if (i >= jobs.length) return 0;
        if (dp[i] != -1) return dp[i];

       
        int skip = solve(i + 1, jobs);

        int next = nextJob(jobs, jobs[i][1]);
        int take = jobs[i][2] + solve(next, jobs);

        return dp[i] = Math.max(take, skip);
    }

  
    private int nextJob(int[][] jobs, int endTime) {
        int l = 0, r = jobs.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (jobs[mid][0] < endTime)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
