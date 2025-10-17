class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
         mp.put(0, -1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int n=sum%k;
            if(mp.containsKey(n)){
               int idx = mp.get(n);
               if(i-idx>=2){
                return true;
               }
            }else{
                mp.put(n,i);
            }
            
        }
      return false;  
    }
}