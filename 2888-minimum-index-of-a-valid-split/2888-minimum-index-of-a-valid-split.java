class Solution {
    public int minimumIndex(List<Integer> nums) {
        int count=0;
        int e=0;
        for(Integer num:nums){
            if(count==0){
                e=num;
                count=1;
            }else if(e==num){
                count++;
            }else{
                count--;
            }
        }
        int majcount=0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==e){
                majcount++;
            }
        }
        int leftcount=0;
        int a =-1;
        int rightcount=majcount;
        for(int i=0;i<nums.size();i++){
            int n1=i+1;
            int n2=nums.size()-i-1;
            if(nums.get(i)==e){
                leftcount++;
                rightcount--;

            }
            if(leftcount>n1/2 && rightcount>n2/2){
               a = i;
               break;
            }

        }
      return a;  
    }
}