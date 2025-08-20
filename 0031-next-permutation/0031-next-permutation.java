class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int round=-1;
        for(int i=len-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                round=i-1;
                break;
            }
        }
        if(round!=-1){
        for(int j=len-1;j>round;j--){
            if(nums[j]>nums[round]){
                swap(nums,j,round);
                break;
            }
        }}
        reverse(round+1,len-1,nums);
        
    }
    public void swap(int[] nums,int round,int j){
        int temp=nums[j];
        nums[j]=nums[round];
        nums[round]=temp;
    }
    public void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;    }

    }
}