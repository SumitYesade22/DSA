
class Solution {
    class Node implements Comparable<Node> {
        int score;
        int index;
        
        Node(int score, int index) {
            this.score = score;
            this.index = index;
        }
        
        
        public int compareTo(Node that) {
            return that.score - this.score;
        }
    }
    
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
       
        for (int i = 0; i < n; i++) {
            pq.offer(new Node(score[i], i));
        }
        
        int rank = 1;
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            
            if (rank == 1) {
                ans[cur.index] = "Gold Medal";
            } else if (rank == 2) {
                ans[cur.index] = "Silver Medal";
            } else if (rank == 3) {
                ans[cur.index] = "Bronze Medal";
            } else {
                ans[cur.index] = String.valueOf(rank);
            }
            
            rank++;
        }
        
        return ans;
    }
}
