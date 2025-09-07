class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Step 1: Create max-heaps for each row
        PriorityQueue<Integer>[] heaps = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            heaps[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int val : grid[i]) {
                heaps[i].offer(val);
            }
        }

        int ans = 0;
        // Step 2: n rounds
        for (int round = 0; round < n; round++) {
            int roundMax = 0;
            for (int i = 0; i < m; i++) {
                int val = heaps[i].poll();
                roundMax = Math.max(roundMax, val);
            }
            ans += roundMax;
        }

        return ans;
    }
}
