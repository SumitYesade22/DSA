class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0;i<rocks.length;i++){
            rocks[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        for( int i=0;i<rocks.length;i++){
            if(rocks[i]>0 && additionalRocks>=rocks[i]){
                additionalRocks-=rocks[i];
                rocks[i]=0;
                
            }
        }
        int c=0;
         for(int i=0;i<rocks.length;i++){
            if(rocks[i]<=0){
               c++;
            }
        }
    return c;  
    }
}