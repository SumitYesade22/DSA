class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
             mp.put(Math.abs(nums[i]-nums[j]),mp.getOrDefault(Math.abs(nums[i]-nums[j]),0)+1);
            }
        }
        int s=0;
        for(int num:mp.keySet()){
            if(num==k){
              s+= mp.get(num);
            }
        }
        return s;
    }
}