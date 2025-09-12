class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int k=0;
        for(int i=0;i<customers.length;i++){
         
         if(i<minutes-1){
            if(grumpy[i]==1){
               sum+=customers[i];
            }
           
            continue;
         }
          if(grumpy[i]==1){
               sum+=customers[i];
            }
         if(sum>max){
            max=sum;
            start=i-minutes+1;
         }
         if(grumpy[i-minutes+1]==1){
             sum-=customers[i-minutes+1];
         }
        
        }
        int c=0;
        for(int j=0;j<customers.length;j++){
           
            if(grumpy[j]==0){
                c+=customers[j];
            }

        }
        return max+c;
    }
}