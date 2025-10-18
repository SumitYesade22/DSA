class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Set<Integer>s=new HashSet<>();
        int n=nums.length;
        int totalflip=0;
        int pastflips=0;

        for(int i=0;i<n;i++){
            if(i>=k && s.contains(i-k)){
                pastflips--;
            }
            if(nums[i]==pastflips%2){
                if(i+k>n){
                    return -1;
                }
                totalflip++;
                pastflips++;
                s.add(i);

            }
        }
      return totalflip;  
    }
}