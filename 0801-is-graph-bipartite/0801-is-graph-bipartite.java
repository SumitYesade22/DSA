
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfs(i, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean bfs(int start, int[][] graph, int[] color) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        color[start] = 0; 

        while (!que.isEmpty()) {
            int u = que.poll();
            for (int v : graph[u]) {
                if (color[v] == -1) { 
                    color[v] = 1 - color[u]; 
                    que.offer(v);
                } else if (color[v] == color[u]) { 
                    return false;
                }
            }
        }
        return true;
    }
}
