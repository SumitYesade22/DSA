
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];

        
        for (int[] pre : prerequisites) {
            int a = pre[0];
            int b = pre[1];
            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
            indegree[a]++;
        }

        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

       
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
                result.add(i);
            }
        }

       
        while (!q.isEmpty()) {
            int u = q.poll();

            if (adj.containsKey(u)) {
                for (int v : adj.get(u)) {
                    indegree[v]--;
                    if (indegree[v] == 0) {
                        q.offer(v);
                        result.add(v);
                    }
                }
            }
        }

       
        if (result.size() != numCourses) {
            return new int[]{};
        }

       
        return result.stream().mapToInt(i -> i).toArray();
    }
}
