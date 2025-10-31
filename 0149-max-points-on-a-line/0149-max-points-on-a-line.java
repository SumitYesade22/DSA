
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1)
            return 1;

        int result = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                double dy = points[j][1] - points[i][1];
                double dx = points[j][0] - points[i][0];

               
                double slope = Math.atan2(dy, dx);

                map.put(slope, map.getOrDefault(slope, 0) + 1);
            }

            for (int count : map.values()) {
                result = Math.max(result, count + 1);
            }
        }

        return result;
    }
}
