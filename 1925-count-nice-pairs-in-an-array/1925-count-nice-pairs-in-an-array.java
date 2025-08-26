class Solution {
    public int countNicePairs(int[] nums) {
        int n = nums.length;
        int MOD = 1_000_000_007;
        long count = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = nums[i] - rev(nums[i]);
            
            if (freq.containsKey(diff)) {
                count = (count + freq.get(diff)) % MOD;
            }
            freq.put(diff, freq.getOrDefault(diff, 0) + 1);
        }
        return (int) count;   
    }

    public int rev(int number) {
        int n = 0;
        while (number != 0) {
            int a = number % 10;
            n = n * 10 + a;
            number /= 10;
        }
        return n;
    }
}
