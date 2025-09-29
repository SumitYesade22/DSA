class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int ans[]=new int[n];
        for(int m=0;m<n;m=m+2){
            while(i<n && nums[i]<0  ){
                i++;
            }
            ans[m]=nums[i++];
             while(j<n && nums[j]>0){
                j++;
            }
            ans[m+1]=nums[j++];
        }
        return ans;
    }
}