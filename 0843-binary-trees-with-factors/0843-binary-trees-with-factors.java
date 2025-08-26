class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int MOD = 1_000_000_007;
        
        Map<Integer, Long> dp = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for (int a : arr) {
            dp.put(a, 1L); 
            set.add(a);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) { 
                    int right = arr[i] / arr[j];
                    if (set.contains(right)) {
                        long ways = (dp.get(arr[j]) * dp.get(right)) % MOD;
                        dp.put(arr[i], (dp.get(arr[i]) + ways) % MOD);
                    }
                }
            }
        }
        
        long result = 0;
        for (long val : dp.values()) {
            result = (result + val) % MOD;
        }
        return (int) result;
    }
}
