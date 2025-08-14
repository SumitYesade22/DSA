class Solution {
    public int findDuplicate(int[] nums) {
            cycleSort(nums);
     
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return -1;
        
    }

    public void cycleSort(int nums[]){
        int n = nums.length;
        int index = 0;
        while(index<n){
            int element = nums[index];
            int correctPos = element-1;
            if(nums[index]!=nums[correctPos]){
                swap(nums,index, correctPos);
            } else {
                index++;
            }
        }
    }
    public void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}














