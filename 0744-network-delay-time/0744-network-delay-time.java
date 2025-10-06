
class Solution {

   
    static class Node implements Comparable<Node> {
        int vertex; 
        int dist;   

        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

       
       
        public int compareTo(Node other) {
            return this.dist - other.dist;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.putIfAbsent(u, new ArrayList<>());
            adj.get(u).add(new int[]{v, w});
        }

        
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(k, 0)); 

        
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int node = current.vertex;
            int currentDist = current.dist;

           
            if (currentDist > dist[node]) continue;

            if (!adj.containsKey(node)) continue;

            for (int[] edge : adj.get(node)) {
                int nextNode = edge[0];
                int weight = edge[1];
                int newDist = currentDist + weight;

                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    pq.offer(new Node(nextNode, newDist));
                }
            }
        }

        
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1; 
            maxTime = Math.max(maxTime, dist[i]);
        }

        return maxTime;
    }
}
