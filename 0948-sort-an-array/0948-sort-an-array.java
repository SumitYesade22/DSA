
class Solution {
    public int[] sortArray(int[] nums) {
        solve(nums, 0, nums.length - 1);
        return nums;
    }

    public void solve(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            solve(nums, start, mid);
            solve(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = nums[start + i];
        for (int j = 0; j < n2; j++)
            right[j] = nums[mid + 1 + j];

        int a = 0, b = 0;
        int k = start;

        while (a < n1 && b < n2) {
            if (left[a] <= right[b]) {
                nums[k] = left[a];
                a++;
            } else {
                nums[k] = right[b];
                b++;
            }
            k++;
        }

       
        while (a < n1) {
            nums[k] = left[a];
            a++;
            k++;
        }
        while (b < n2) {
            nums[k] = right[b];
            b++;
            k++;
        }
    }
}
