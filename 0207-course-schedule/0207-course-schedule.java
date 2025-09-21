class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Step 1: build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            int course = pre[0];   // dependent
            int prereq = pre[1];   // prerequisite
            graph.get(prereq).add(course);
            indegree[course]++;
        }

        // Step 2: init queue with indegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        // Step 3: process
        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            for (int next : graph.get(curr)) {
                indegree[next]--;
                if (indegree[next] == 0) queue.offer(next);
            }
        }

        return count == numCourses;
    }
}
