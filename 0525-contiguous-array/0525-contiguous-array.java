class Solution {
    public int findMaxLength(int[] nums) {
        int i=0;
        for(int n:nums){
          if(n==0){
            nums[i]=-1;
          }
          i++;
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        int max=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(sum==0){
                max=Math.max(max,j+1);
            }
            if(mp.containsKey(sum)){
                max=Math.max(max,j-mp.get(sum));
            }else{
                mp.put(sum,j);
                
            }

        }

     return max;   
    }
}