class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,List<Integer>>mp=new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            mp.put(i+1,new ArrayList<>());
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                     mp.get(i+1).add(j+1);
                }
               
            }
        }
        boolean visited[]=new boolean[n+1];

        int c=0;
        for(int i=0;i<n;i++){
            if(!visited[i+1]){
                visited[i+1]=true;
                c++;
                dfs(visited,mp,i+1);
            }
        }
      return c;  
    }
    public void dfs(boolean visited[],HashMap<Integer,List<Integer>>mp,int i){

        for(int n:mp.get(i)){
            if(!visited[n]){
                visited[n]=true;
                dfs(visited,mp,n);
            }
        }
    }
}