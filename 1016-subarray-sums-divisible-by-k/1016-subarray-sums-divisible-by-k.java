class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,List<Integer>>mp=new HashMap<>();
        mp.put(0,new ArrayList<>());
        mp.get(0).add(-1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int n = (sum % k + k) % k;
            if(mp.containsKey(n)){
               ans+=mp.get(n).size();
               mp.get(n).add(i);
            }else{
                mp.put(n,new ArrayList<>());
                mp.get(n).add(i);
            }
        }
        
      return ans;  
    }
}