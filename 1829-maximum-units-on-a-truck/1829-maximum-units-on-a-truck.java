class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        if(truckSize==0){
            return 0;
        }
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int n=boxTypes.length;
        int ans=0;
        for(int[] arr:boxTypes){
            int no=arr[0];
            int unitper=arr[1];
            while(no!=0){
               ans+=unitper;
               no--;
               truckSize--;
               if(truckSize==0){
                return ans;
               }
            }
        }
      return ans;  
    }
}