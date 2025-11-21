class Solution {
    int m, n;
    int[][] t = new int[201][201];

    public int solve(int i, int j, int[][] dungeon) {
        if (i >= m || j >= n)
            return (int)1e9;

        if (t[i][j] != -1)
            return t[i][j];

        if (i == m - 1 && j == n - 1)
            return t[i][j] = (dungeon[i][j] > 0 ? 1 : Math.abs(dungeon[i][j]) + 1);

        int down  = solve(i + 1, j, dungeon);
        int right = solve(i, j + 1, dungeon);

        int res = Math.min(down, right) - dungeon[i][j];
        return t[i][j] = (res > 0 ? res : 1);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        m = dungeon.length;
        n = dungeon[0].length;
        
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, dungeon);
    }
}