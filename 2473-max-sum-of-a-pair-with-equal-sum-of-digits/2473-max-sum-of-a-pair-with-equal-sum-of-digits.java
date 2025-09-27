import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        int max = -1; // use -1 since result might be -1 if no pair exists
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int n : nums) {
            int s = digit(n);

            // initialize if not present
            map.putIfAbsent(s, new PriorityQueue<>(Collections.reverseOrder()));

            // if there is already a number with same digit sum
            if (!map.get(s).isEmpty()) {
                max = Math.max(max, map.get(s).peek() + n);
            }

            // add current number into PQ
            map.get(s).offer(n);
        }

        return max;
    }

    public int digit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
