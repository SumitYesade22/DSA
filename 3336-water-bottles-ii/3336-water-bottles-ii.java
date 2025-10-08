class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int a=numBottles;
        while(a>=numExchange){
            a-=numExchange;
            a++;
            ans++;
            numExchange++;
        }
      return ans;  
    }
}