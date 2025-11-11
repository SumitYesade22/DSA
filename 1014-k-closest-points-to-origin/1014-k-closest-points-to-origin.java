class Solution {
    
    static class Point implements Comparable<Point>{
        int[] pt;
        int distSq;

        public Point(int[] pt, int distSq){
            this.pt =  pt;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Point that){
            return this.distSq - that.distSq;
        }
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int distSq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            pq.add(new Point(points[i], distSq));
        }

        int[][] res = new int[k][2];
        for(int i=0; i<k; i++){
            res[i] = pq.remove().pt;
        }
        return res;
    }
}