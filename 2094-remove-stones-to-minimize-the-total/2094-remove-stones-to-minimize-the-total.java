class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        for(int pile:piles){
            maxpq.offer(pile);
        }
        while(k>0){
            k--;
            int n=maxpq.poll();
            n=n-n/2;
            maxpq.offer(n);
        }
        int sum=0;
        while(!maxpq.isEmpty()){
            sum+=maxpq.poll();
        }

        return sum;
    }
}