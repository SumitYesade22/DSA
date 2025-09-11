class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0;   // zeros in window
        int start = 0;
        boolean hasZero = false; // <-- track presence of any zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                hasZero = true;      // mark that array has at least one zero
            }

            if (count == 1) {
                max = Math.max(max, i - start);
            }

            while (count > 1) {
                if (nums[start] == 0) {
                    count--;
                }
                start++;
            }
        }

        // If there is no zero at all, we must delete one element -> n-1
        return hasZero ? max : nums.length - 1;
    }
}
