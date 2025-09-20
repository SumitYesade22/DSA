class Node implements Comparable<Node> {
    int val;
    int f;

    public Node(int val, int f) {
        this.val = val;
        this.f = f;
    }

    @Override
    public int compareTo(Node that) {
        return this.f - that.f; // min-heap by frequency
    }
}

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.offer(new Node(entry.getKey(), entry.getValue()));
        }

        while (k > 0 && !pq.isEmpty()) {
            Node temp = pq.peek();
            if (temp.f <= k) {
                k -= temp.f;
                pq.poll();
            } else {
                break;
            }
        }

        return pq.size();
    }
}
