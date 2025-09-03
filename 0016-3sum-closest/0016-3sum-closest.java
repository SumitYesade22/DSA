class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int st=0;
        int ed=0;
        int ressum=nums[0]+nums[1]+nums[2];
        int mindif=Integer.MAX_VALUE;
        for(int j=0;j<nums.length-2;j++){
            int num=nums[j];
            int left=j+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[j]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                int dif=Math.abs(sum-target);
                if(dif<mindif){
                    ressum=sum;
                    mindif=dif;
                }
            }
        }
    return ressum; 
    }
}