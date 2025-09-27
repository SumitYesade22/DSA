class Solution {
    public int minimumArea(int[][] grid) {
        int maxrow=-1;
        int maxcol=-1;
        int minrow=grid.length;
        int mincol=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minrow=Math.min(minrow,i);
                    maxrow=Math.max(maxrow,i);
                    mincol=Math.min(mincol,j);
                    maxcol=Math.max(maxcol,j);

                }
            }
        }
     return (maxrow-minrow+1)*(maxcol-mincol+1);   
    }
}