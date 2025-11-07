class Solution {
    int[][]dp=new int[501][501];
    public int minInsertions(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return solve(s,i,j);
        
    }
    public int solve(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=solve(s,i+1,j-1);
        }else{
            return dp[i][j]=1+Math.min(solve(s,i+1,j),solve(s,i,j-1));
        }
    }
}