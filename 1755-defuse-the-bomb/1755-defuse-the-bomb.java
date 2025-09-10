class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k == 0) return res;

        int start, end;
        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n + k;
            end = n - 1;
        }

        int windowSum = 0;
        for (int i = start; i <= end; i++) {
            windowSum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            res[i] = windowSum;
            windowSum -= code[(start + i) % n];
            windowSum += code[(end + 1 + i) % n];
        }

        return res;
    }
}
