class Solution {
    public int countPrimes(int n) {
        int ans[]=new int[n+1];
        Arrays.fill(ans,1);
        for(int i=2;i<Math.sqrt(n);i++){
            if(ans[i]==1){
               for(int j=i*i;j<n;j+=i){
                     ans[j]=0;
               }
            }
            
        }
        int c=0;
        for(int i=2;i<n;i++){
             if(ans[i]==1){
                c++;
             }
        }
      return c;  
    }
}