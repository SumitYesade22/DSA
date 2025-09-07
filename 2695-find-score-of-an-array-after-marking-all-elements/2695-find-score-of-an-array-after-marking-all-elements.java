class node implements Comparable<node> {
    int el;
    int i;
    int m;
    node(int el, int i, int m) {
        this.el = el;
        this.i = i;
        this.m = m;
    }
    public int compareTo(node that) {
        if (this.el == that.el) {
            return this.i - that.i;
        }
        return this.el - that.el;
    }
}

class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<node> pq = new PriorityQueue<>();
        int k = 0;
        for (int num : nums) {
            pq.offer(new node(num, k, 0));
            k++;
        }

        long score = 0;
        boolean[] marked = new boolean[nums.length];

        while (!pq.isEmpty()) {
            node Node = pq.poll();
            int idx = Node.i;

            if (marked[idx]) {
                continue;
            }

            score += Node.el;
            marked[idx] = true;

            if (idx + 1 < nums.length) {
                marked[idx + 1] = true;
            }
            if (idx - 1 >= 0) {
                marked[idx - 1] = true;
            }
        }
        return score;
    }
}
