class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); 

        if (k == 0) return nums; 
        if (2 * k + 1 > n) return ans; 

        long windowSum = 0; 
        for (int i = 0; i < 2 * k + 1; i++) {
            windowSum += nums[i];
        }

        
        ans[k] = (int)(windowSum / (2 * k + 1));

        for (int i = k + 1; i < n - k; i++) {
            windowSum -= nums[i - k - 1];
            windowSum += nums[i + k];
            ans[i] = (int)(windowSum / (2 * k + 1));
        }

        return ans;
    }
}
