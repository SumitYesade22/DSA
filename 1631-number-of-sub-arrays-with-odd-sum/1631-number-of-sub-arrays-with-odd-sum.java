class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        mp.put(0, new ArrayList<>());  // even prefix sum indices
        mp.put(1, new ArrayList<>());  // odd prefix sum indices
        mp.get(0).add(-1);             // empty prefix = even

        long MOD = 1_000_000_007L;
        long ans = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int r = (sum % 2 + 2) % 2; // ensure non-negative mod

            // count subarrays ending at i with odd sum
            if (r == 1) ans = (ans + mp.get(0).size()) % MOD;
            else ans = (ans + mp.get(1).size()) % MOD;

            // add current prefix
            mp.get(r).add(i);
        }

        return (int)(ans % MOD);
    }
}
