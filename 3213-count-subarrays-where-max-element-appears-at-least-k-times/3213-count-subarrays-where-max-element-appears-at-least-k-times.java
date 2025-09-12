class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxElement = Integer.MIN_VALUE;
        for (int num : nums) maxElement = Math.max(maxElement, num);

        long ans = 0;
        int start = 0;
        int freq = 0;

        for (int end = 0; end < n; end++) {
            if (nums[end] == maxElement) {
                freq++;
            }

            while (freq >= k) {
                if (nums[start] == maxElement) {
                    freq--;
                }
                start++;
            }

            ans += start; 
        }

        return ans;
    }
}
