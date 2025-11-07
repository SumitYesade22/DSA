class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] big=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);
        int i=0;
        long a=0;
        int j=nums.length-1;
        while(i<j){
            a+=Math.pow(nums[j],2)-Math.pow(nums[i],2);
             i++;
             j--;
        }
        if(i==j){
            a+=Math.pow(nums[i],2);
        }
        return a;
    }
}