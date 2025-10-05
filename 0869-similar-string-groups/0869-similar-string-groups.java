
class Solution {
    
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        
        // Build adjacency map
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSimilar(strs[i], strs[j])) {
                    map.putIfAbsent(i, new ArrayList<>());
                    map.putIfAbsent(j, new ArrayList<>());
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        
        boolean[] visited = new boolean[n];
        int groups = 0;
        
        // DFS for each unvisited string
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, map);
                groups++;
            }
        }
        return groups;
    }
    
    private boolean isSimilar(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff == 2 || diff == 0;
    }
    
    private void dfs(int node, boolean[] visited, Map<Integer, List<Integer>> map) {
        visited[node] = true;
        for (int neighbor : map.getOrDefault(node, new ArrayList<>())) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, map);
            }
        }
    }
}
