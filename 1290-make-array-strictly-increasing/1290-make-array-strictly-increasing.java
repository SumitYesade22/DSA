
class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        memo.clear();
        int res = solve(0, arr1, arr2, Integer.MIN_VALUE);
        return res >= 1e9 ? -1 : res;
    }

    public int solve(int i, int[] arr1, int[] arr2, int prev) {
        if (i == arr1.length)
            return 0;

        String key = i + "," + prev;
        if (memo.containsKey(key))
            return memo.get(key);

        int res1 = (int) 1e9;
        
        if (arr1[i] > prev)
            res1 = solve(i + 1, arr1, arr2, arr1[i]);

        int res2 = (int) 1e9;
        int b = nextgreater(arr2, prev);
        if (b < arr2.length)
            res2 = 1 + solve(i + 1, arr1, arr2, arr2[b]);

        int ans = Math.min(res1, res2);
        memo.put(key, ans);
        return ans;
    }

    public int nextgreater(int[] arr2, int target) {
        int l = 0;
        int r = arr2.length - 1;
        int ans = arr2.length;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr2[mid] <= target) {
                l = mid + 1;
            } else {
                ans = mid;
                r = mid - 1;
            }
        }
        return l;
    }
}
