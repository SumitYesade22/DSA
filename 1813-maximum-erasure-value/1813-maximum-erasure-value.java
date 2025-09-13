class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int max=0;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
            sum+=nums[right];
            while(mp.get(nums[right])>1){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                sum-=nums[left];
                left++;
            }
            max=Math.max(max,sum);
        }
     return max;   
    }
}