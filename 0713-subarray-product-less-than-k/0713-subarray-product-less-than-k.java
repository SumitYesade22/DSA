class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        int p=1;
        int c=0;
        if (k <= 1) return 0;

        for(int i=0;i<n;i++){
           p*=nums[i];
           while(p>=k){
            p/=nums[s];
            s++;
           }
           c+=i-s+1;
        }
     return c;   
    }
}