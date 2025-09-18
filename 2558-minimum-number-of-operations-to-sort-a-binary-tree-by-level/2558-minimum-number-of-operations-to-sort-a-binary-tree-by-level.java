class Solution {
    public int minimumOperations(TreeNode root) {
        int s = 0;
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int si = que.size();
            List<Integer> arr = new ArrayList<>();
            while (si-- > 0) {
                TreeNode pq = que.poll();
                arr.add(pq.val);
                if (pq.left != null) que.offer(pq.left);
                if (pq.right != null) que.offer(pq.right);
            }
            List<Integer> unsorted = new ArrayList<>(arr);
            Collections.sort(arr);
            s += findcount(arr, unsorted);
        }
        return s;
    }

    public int findcount(List<Integer> arr, List<Integer> unsorted) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            pos.put(arr.get(i), i);
        }

        int swaps = 0;
        for (int i = 0; i < unsorted.size(); i++) {
            while (!unsorted.get(i).equals(arr.get(i))) {
                int correctIndex = pos.get(unsorted.get(i));

                // swap unsorted[i] with unsorted[correctIndex]
                int temp = unsorted.get(i);
                unsorted.set(i, unsorted.get(correctIndex));
                unsorted.set(correctIndex, temp);

                swaps++;
            }
        }
        return swaps;
    }
}
