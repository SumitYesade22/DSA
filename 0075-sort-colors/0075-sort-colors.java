class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                swap(nums,start,mid);
                start++;
                mid++;
                break;

                case 1:
                mid++;
                break;

                case 2:
                swap(nums,mid,end);
                end--;
                break;
            }
        }

    }
    public void swap(int arr[],int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
}