class Solution {
    int[][]t;
    public int minScoreTriangulation(int[] values) {
        t=new int[51][51];
        for(int[]arr:t){
            Arrays.fill(arr,-1);
        }
        int ans=solve(values,0,values.length-1);
        return ans;
        
    }
    public int solve(int[] values,int i , int j){
        if(j-i+1<3){
            return 0;
        }
        if(t[i][j]!=-1){
            return t[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
        int total=values[i]*values[j]*values[k]+solve(values,i,k)+solve(values,k,j);
        min=Math.min(total,min);
        }
        return t[i][j]=min;
    }
}