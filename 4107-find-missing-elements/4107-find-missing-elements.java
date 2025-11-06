class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int prev = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] != prev + 1) {
                ans.add(prev + 1);
                prev++; 
            }
            prev = nums[i]; 
        }
        return ans;
    }
}
