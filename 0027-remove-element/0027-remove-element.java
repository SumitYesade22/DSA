class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i= 0 ; i<nums.length;i++){
            if(nums[i]==val){
                c++;
                nums[i]='_';
            }
        }
        Arrays.sort(nums);
        return nums.length-c;
        
    }
}