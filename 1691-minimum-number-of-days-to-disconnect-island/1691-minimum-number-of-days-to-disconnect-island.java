class Solution {
    public int minDays(int[][] grid) {
        

        int islands=countislands(deepcopy(grid));
        if(islands>1 || islands==0){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    int n=countislands(deepcopy(grid));
                    if(n>1 || n==0){
                        return 1;
                    }
                    grid[i][j]=1;
                }

        }
        }
    

     return 2;   
    }
    public int countislands(int[][]grid){
     int n=grid.length;
     int m=grid[0].length;
     int c=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                dfs(grid,i,j,n,m);
                c++;
            }
        }
     }
     return c;
    }
    public void dfs(int[][]grid,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m){
            return;
        }
        if(grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid,i+1,j,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i,j-1,n,m);
    }
    public int[][] deepcopy(int[][] grid){
         int[][] copy = new int[grid.length][];
for (int i = 0; i < grid.length; i++) {
    copy[i] = grid[i].clone();
}
return copy;
    }
}