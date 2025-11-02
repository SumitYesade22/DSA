class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]=new int[n][m];
        if(obstacleGrid[0][0]==1){
            return 0;
        }else{
            dp[0][0]=1;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                if(i==0 && j>0){
                    dp[i][j]+=dp[i][j-1];
                    continue;
                }
                if(j==0 && i>0){
                    dp[i][j]+=dp[i-1][j];
                    continue;
                }
                if(i>0 && j>0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                


            }
        }
      return dp[n-1][m-1];  
    }
}