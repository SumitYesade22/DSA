class Solution {
    public int subsetXORSum(int[] nums) {
        int ans=solve(nums,0,0);
        return ans;

    }
    public int solve(int nums[],int i,int a){
        if(i==nums.length){
            return a;
        }
        int include=solve(nums,i+1,a^nums[i]);
        int exclude=solve(nums,i+1,a);
        return include+exclude;
    }
}