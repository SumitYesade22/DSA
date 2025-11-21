class Solution {
    int[][] d={{1,0},{0,1},{-1,0},{0,-1}};
    public int getMaximumGold(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int maxg=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                   maxg=Math.max(maxg,dfs(grid,i,j));
                }
            }
        }
        return maxg;
    }
    public int dfs(int[][]grid,int i,int j){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int cgold=grid[i][j];
        grid[i][j]=0;
        int max=0;
        for(int k=0;k<4;k++){
                int ci=i+d[k][0];
                int cj=j+d[k][1];
                max=Math.max(max,dfs(grid,ci,cj));
            
        }
        grid[i][j]=cgold;
        return cgold+max;

    }
}