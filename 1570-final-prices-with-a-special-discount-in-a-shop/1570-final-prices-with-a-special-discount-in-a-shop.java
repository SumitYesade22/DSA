class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = prices.length-1;i >= 0; i--){
            while(!stack.isEmpty() && prices[i] < stack.peek()){
                stack.pop();
            }
            int small = stack.isEmpty() ? 0 : stack.peek();
            ans[i] = prices[i] - small;
            stack.push(prices[i]);
        }
        return ans;
    }
}