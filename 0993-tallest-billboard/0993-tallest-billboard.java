class Solution {
    int[][] t;

    public int tallestBillboard(int[] rods) {

        t = new int[rods.length][10001]; 

        for (int i = 0; i < rods.length; i++)
            java.util.Arrays.fill(t[i], -1);

        return solve(rods, 0, 0) / 2;
    }

    public int solve(int[] rods, int i, int diff) {

        if (i == rods.length) {
            if (diff == 0)
                return 0;
            return Integer.MIN_VALUE;
        }

        if (t[i][diff + 5000] != -1)
            return t[i][diff + 5000];

        int notTake = solve(rods, i + 1, diff);

        int leftTake = rods[i] + solve(rods, i + 1, diff + rods[i]);

        int rightTake = rods[i] + solve(rods, i + 1, diff - rods[i]);

        return t[i][diff + 5000] =
                Math.max(notTake, Math.max(leftTake, rightTake));
    }
}
