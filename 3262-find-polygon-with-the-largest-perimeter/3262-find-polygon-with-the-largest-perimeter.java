class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long c=0;
        long p=0;

        for(int i=0;i<nums.length;i++){
         
          if(nums[i]<c){
            p=nums[i]+c;
          }
            c+=nums[i];
        }
      return p==0?-1:p;  
    }
}