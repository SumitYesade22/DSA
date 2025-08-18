class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max=0;
        if(n==1){
            return true;
        }
        for(int i=0 ; i < n-1;i++){
            int sum=i+nums[i];
            max=Math.max(sum,max);

            if(i>=max){
                return false;
            }
            
        }
    return true;
    }
}