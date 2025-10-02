class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public int[][] findFarmland(int[][] land) {
        int n = land.length, m = land[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    List<Integer> temp = new ArrayList<>();
                    int[] bottomRight = dfs(land, i, j, temp);
                    ans.add(List.of(temp.get(0), temp.get(1), bottomRight[0], bottomRight[1]));
                }
            }
        }

       
        int[][] res = new int[ans.size()][4];
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 4; j++) {
                res[i][j] = ans.get(i).get(j);
            }
        }
        return res;
    }

    private int[] dfs(int[][] land, int i, int j, List<Integer> topLeft) {
        if (i < 0 || j < 0 || i >= land.length || j >= land[0].length || land[i][j] == 0)
            return new int[]{-1, -1};

        land[i][j] = 0; 

       
        if (topLeft.isEmpty()) {
            topLeft.add(i);
            topLeft.add(j);
        }

        int[] bottomRight = {i, j};
        int[] down = dfs(land, i + 1, j, topLeft);
        int[] right = dfs(land, i, j + 1, topLeft);

        if (down[0] > bottomRight[0]) bottomRight[0] = down[0];
        if (down[1] > bottomRight[1]) bottomRight[1] = down[1];
        if (right[0] > bottomRight[0]) bottomRight[0] = right[0];
        if (right[1] > bottomRight[1]) bottomRight[1] = right[1];

        return bottomRight;
    }
}
