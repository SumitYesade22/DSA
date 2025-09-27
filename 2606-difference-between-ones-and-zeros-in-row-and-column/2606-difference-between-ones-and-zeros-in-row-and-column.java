class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int colz[]=new int[m];
        int col1[]=new int[m];
        int rowz[]=new int[n];
        int row1[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    col1[j]++;
                    row1[i]++;
                }else{
                    colz[j]++;
                    rowz[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j] = row1[i] + col1[j] - rowz[i] - colz[j];
            }
        }
    return grid;    
    }
}