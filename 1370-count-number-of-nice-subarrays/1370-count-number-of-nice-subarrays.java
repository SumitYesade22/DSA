class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int ans = 0;
        int c = 0;
        
        for (int num : nums) {
            if (num % 2 == 1) {
                c++;
            }
            ans += count.getOrDefault(c - k, 0);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        return ans;
    }
}
