class Solution {
    public int arrangeCoins(int n) {
        int ans=(int)Math.floor((-1+Math.sqrt(1+8.0*n))/2);
        return ans;
    }
}