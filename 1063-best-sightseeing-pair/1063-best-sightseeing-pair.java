class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int j[]=new int[n];
        for(int i=0;i<n;i++){
        j[i]=values[i]-i;
        }
        int max=values[0];
        int ans=0;
        for(int i=1;i<n;i++){
           
            ans=Math.max(ans,max+j[i]);
             max=Math.max(max,values[i]+i);

        }
     return ans;   
    }
}