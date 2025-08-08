class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startrow = 0;
        int endrow = rows-1;
        int startcol = 0 ;
        int endcol = cols-1 ;
        while(startrow <= endrow && startcol <= endcol){
            for(int i = startcol ; i <= endcol ; i++){
                ans.add(matrix[startrow][i]);
            }
            startrow++;
                for(int i = startrow ; i <= endrow ; i++){
                ans.add(matrix[i][endcol]);
            }
            endcol--;
            if(startrow<=endrow){
                for(int i = endcol ; i >= startcol ; i--){
                ans.add(matrix[endrow][i]);
            }
            endrow--;}
            if(startcol<=endcol){
                for(int i = endrow ; i >= startrow ; i--){
                ans.add(matrix[i][startcol]);
            }
            startcol++;}
        }

        return ans;
    }
}