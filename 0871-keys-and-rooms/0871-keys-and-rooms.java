class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
    boolean arr[]=new boolean[n];
        dfs(rooms,0,arr);
        for(boolean b:arr){
            if(b==false){
                return false;
            }
        }
      return true;  
    }
    public void dfs(List<List<Integer>> rooms,int room,boolean arr[]){
        arr[room]=true;
        for(int n:rooms.get(room)){
            if(arr[n]!=true){
                dfs(rooms,n,arr);
            }
        }

    }
}