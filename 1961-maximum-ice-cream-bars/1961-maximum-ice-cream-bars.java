class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int s=0;
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]){
               s++;
               coins-=costs[i];
            }
        }
        return s;
    }
}