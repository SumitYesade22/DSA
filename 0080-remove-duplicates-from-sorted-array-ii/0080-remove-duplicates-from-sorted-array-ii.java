class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int n = nums.length;
        int index=2;
        for(int i=2 ; i <n ; i++){

            if(nums[i]!=nums[index-2]){
                nums[index]=nums[i];
                index++;
            }

        }
        return index;
    }
}