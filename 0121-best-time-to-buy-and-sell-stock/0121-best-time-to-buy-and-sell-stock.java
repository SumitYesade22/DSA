class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int maxvar=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,maxvar-prices[i]);
            maxvar=Math.max(maxvar,prices[i]);
        }
        return max;
    }

}