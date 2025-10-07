class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        

        
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 1;
        }

        
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 2;
        }

        
        for (int[] guard : guards) {
            int i = guard[0];
            int j = guard[1];

            dfs(i - 1, j, -1, 0, grid); 
            dfs(i + 1, j, 1, 0, grid);  
            dfs(i, j - 1, 0, -1, grid); 
            dfs(i, j + 1, 0, 1, grid);  
        }

       
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }

   
    private void dfs(int i, int j, int di, int dj, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == 1 || grid[i][j] == 2) return; 

        grid[i][j] = 3;
        dfs(i + di, j + dj, di, dj, grid); 
    }
}
