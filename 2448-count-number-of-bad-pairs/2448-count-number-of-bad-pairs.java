class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = i - nums[i];
            m.put(diff, m.getOrDefault(diff, 0) + 1);
        }

        long goodPairs = 0;
        for (int values : m.values()) {
            goodPairs += (long) values * (values - 1) / 2;  
        }

        long totalPairs = (long) n * (n - 1) / 2;          
        return totalPairs - goodPairs;                     
    }
}
