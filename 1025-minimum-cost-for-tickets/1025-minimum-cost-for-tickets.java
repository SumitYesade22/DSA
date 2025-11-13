class Solution {
    int[] dp = new int[366];

    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(dp, -1);
        return solve(days, costs, 0);
    }

    public int solve(int[] days, int[] costs, int index) {
        if (index >= days.length) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int cost1 = costs[0] + solve(days, costs, index + 1);

        int i = index;
        while (i < days.length && days[i] < days[index] + 7) {
            i++;
        }
        int cost2 = costs[1] + solve(days, costs, i);

        
        i = index;
        while (i < days.length && days[i] < days[index] + 30) {
            i++;
        }
        int cost3 = costs[2] + solve(days, costs, i);

        return dp[index] = Math.min(cost1, Math.min(cost2, cost3));
    }
}
