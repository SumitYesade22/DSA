class Solution {
    int dp[][][];
    public int findMaxForm(String[] strs, int m, int n) {
        int len=strs.length;
        dp=new int[len][m+1][n+1];
           for (int i = 0; i < len; i++)
            for (int j = 0; j <= m; j++)
                for (int k = 0; k <= n; k++)
                    dp[i][j][k] = -1;

        int arr[][]=new int[len][2];
        for(int i=0;i<len;i++){
            int one=0;
            int zero=0;
            for(char ch:strs[i].toCharArray()){
                 if(ch=='1'){
                    one++;
                 }else{
                    zero++;
                 }
            }
            arr[i][0]=zero;
            arr[i][1]=one;
        }
        int ans=solve(arr,m,n,0);
        return ans;
        
    }
    public int solve(int[][]arr,int m,int n,int st){
        if(st>=arr.length){
            return 0;
        }
        if(dp[st][m][n]!=-1){
            return dp[st][m][n];
        }
        int take=0;
        if(arr[st][0]<=m && arr[st][1]<=n){
            take=1+solve(arr,m-arr[st][0],n-arr[st][1],st+1);
        }
        int skip=solve(arr,m,n,st+1);
        return dp[st][m][n]=Math.max(take,skip);

    }
}