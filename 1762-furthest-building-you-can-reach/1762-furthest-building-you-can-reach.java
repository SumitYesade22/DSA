class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        int i = 0;

        while (i < heights.length - 1) {
            int dif = heights[i + 1] - heights[i];

            if (dif > 0) {
                pq.offer(dif);

                if (pq.size() > ladders) {
                    bricks -= pq.poll(); 
                }

                if (bricks < 0) {
                    return i;
                }
            }

            i++;
        }

        return i;
    }
}
