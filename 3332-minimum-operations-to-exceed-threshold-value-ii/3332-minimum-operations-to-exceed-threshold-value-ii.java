class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> ans = new PriorityQueue<>();
        for (int n : nums) ans.offer((long) n);

        int op = 0;
        while (ans.size() >= 2 && ans.peek() < (long) k) {
            long x = ans.poll();
            long y = ans.poll();
            long num = x * 2L + y;   // prevent overflow
            ans.offer(num);
            op++;
        }
        return op;
    }
}