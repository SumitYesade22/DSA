class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean a=true;
                for(int m=0;m<n;m++){
                    if(grid[i][m]!=grid[m][j]){
                        a=false;
                        break;
                    }
                }
                if(a==true){
                    count++;
                }
            }
        }
    return count;   
    }
}
