class Solution {
    public int[][] generateMatrix(int n) {
        int [][] res = new int[n][n];
       
        int startrow = 0;
        int endrow = n-1;
        int startcol = 0 ;
        int endcol = n-1 ;
        int val=1;
        while(startrow <= endrow && startcol <= endcol){
            for(int i = startcol ; i <= endcol ; i++){
                res[startrow][i]=val;
                val++;
            }
            startrow++;
                for(int i = startrow ; i <= endrow ; i++){
                res[i][endcol]=val;
                val++;
            }
            endcol--;
            if(startrow<=endrow){
                for(int i = endcol ; i >= startcol ; i--){
                res[endrow][i]=val;
                val++;
            }
            endrow--;}
            if(startcol<=endcol){
                for(int i = endrow ; i >= startrow ; i--){
                res[i][startcol]=val;
                val++;
            }
            startcol++;}
        }

        return res; 
    }
}
