class Solution {
    public int pivotInteger(int n) {
        int num[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
            sum += num[i];
        }

        int l = 0;
        for (int i = 0; i < n; i++) {   // start from 0 instead of 1
            l += num[i];
            int r = sum - l + num[i];   // right sum including current number
            if (l == r) {
                return num[i];
            }
        }

        return -1;
    }
}
