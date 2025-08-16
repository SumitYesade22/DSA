class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            if (curr > 0 || stack.isEmpty()) {
                stack.push(curr);
            } else {
                // collision case
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(curr)) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(curr)) {
                    stack.pop(); // both destroyed
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(curr);
                }
            }
        }

        // build result array
        int[] arr = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            arr[j] = stack.pop();
        }

        return arr;
    }
}
