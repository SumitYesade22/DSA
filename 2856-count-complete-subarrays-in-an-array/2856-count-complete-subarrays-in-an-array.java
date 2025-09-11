class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        int start=0;
        for(int n:nums){
            set.add(n);
        }
        int size=0;
        int d=set.size();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            while(mp.size()==d){
                  size+=nums.length-i;
                  mp.put(nums[start],mp.get(nums[start])-1); 
                  if(mp.get(nums[start])==0){
                    mp.remove(nums[start]);
                  }
                  start++;
            }
        }
     return size;   
    }
}