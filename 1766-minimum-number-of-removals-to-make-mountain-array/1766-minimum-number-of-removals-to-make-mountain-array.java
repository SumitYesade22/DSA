
class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];

        Arrays.fill(l, 1);
        Arrays.fill(r, 1);

        // Compute LIS for each position
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    l[i] = Math.max(l[i], l[j] + 1);
                }
            }
        }

        // Compute LDS for each position
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    r[i] = Math.max(r[i], r[j] + 1);
                }
            }
        }

        int longestMountain = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > 1 && r[i] > 1) {
                longestMountain = Math.max(longestMountain, l[i] + r[i] - 1);
            }
        }

        return n - longestMountain;
    }
}
