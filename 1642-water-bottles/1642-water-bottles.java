class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        int l=0;
        while(numBottles>0){
            ans+=numBottles;
            l+=numBottles;
            numBottles=l/numExchange;
            l=l%numExchange;
            
            
        }
        return ans;
    }
}