class Solution {
    public int minOperations(int[] nums) {
        Set<Integer>s=new HashSet<>();
        int n=nums.length;
        int totalflip=0;
        int pastflips=0;

        for(int i=0;i<n;i++){
            if(i>=3 && s.contains(i-3)){
                pastflips--;
            }
            if(nums[i]==pastflips%2){
                if(i+3>n){
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

