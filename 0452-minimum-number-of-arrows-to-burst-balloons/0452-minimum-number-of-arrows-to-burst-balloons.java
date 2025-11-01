class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, Comparator.comparingInt(i -> i[0]));

        int n = points.length;
        int i = 0;
        int count = 0;

        while (i < n) {
            
            int end = points[i][1];
            int j = i + 1;

            
            while (j < n && points[j][0] <= end) {
                end = Math.min(end, points[j][1]); 
                j++;
            }

            count++; 
            i = j;   
        }

        return count;
    }
}
