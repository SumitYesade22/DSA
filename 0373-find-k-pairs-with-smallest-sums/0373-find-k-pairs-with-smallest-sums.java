
class Node implements Comparable<Node> {
    int i, j, sum;

    public Node(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }

    public int compareTo(Node that) {
        return this.sum - that.sum;
    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return res;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        Set<String> visited = new HashSet<>();

      
        pq.offer(new Node(0, 0, nums1[0] + nums2[0]));
        visited.add("0,0");

        while (k > 0 && !pq.isEmpty()) {
            Node node = pq.poll();
            int i = node.i, j = node.j;

            res.add(Arrays.asList(nums1[i], nums2[j]));
            k--;

            
            if (i + 1 < nums1.length && !visited.contains((i + 1) + "," + j)) {
                pq.offer(new Node(i + 1, j, nums1[i + 1] + nums2[j]));
                visited.add((i + 1) + "," + j);
            }
            if (j + 1 < nums2.length && !visited.contains(i + "," + (j + 1))) {
                pq.offer(new Node(i, j + 1, nums1[i] + nums2[j + 1]));
                visited.add(i + "," + (j + 1));
            }
        }

        return res;
    }
}
