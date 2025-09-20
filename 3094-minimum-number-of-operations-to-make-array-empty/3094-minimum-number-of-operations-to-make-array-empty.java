class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int minop=0;
        int i=0;
        while(i<n){
            int num=nums[i];
            int c=1;
            i++;
            while(i<n && nums[i]==num){
                c++;
                i++;
            }
            if(c==1){
                return -1;
            }else if(c%3==0){
                minop+=c/3;
            }else{
                minop+=c/3+1;
            }
        }
      return minop;  
    }
}