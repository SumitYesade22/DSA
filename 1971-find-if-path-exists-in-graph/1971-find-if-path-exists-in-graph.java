class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,ArrayList<Integer>> mp=new HashMap<>();

        for(int i = 0; i < n; i++){
            mp.put(i, new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];

            mp.get(a).add(b);
            mp.get(b).add(a); // FIX 1: undirected graph
        }

        int visited[]=new int[n];
        return solve(mp,source,destination,visited); 
    }

    public boolean solve(Map<Integer,ArrayList<Integer>> mp, int source, int destination, int visited[]){
        if(source==destination){
            return true;
        }

        visited[source]=1;

        for(int next : mp.get(source)){
            if(visited[next]==0){
                boolean ans = solve(mp,next,destination,visited);
                if(ans){
                    return true;
                }
            }
        }

        return false;
    }
}
