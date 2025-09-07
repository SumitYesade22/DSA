class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:gifts){
            pq.offer(n);
        }
        while(k!=0){
            int num=pq.poll();
            pq.offer((int)Math.floor(Math.sqrt(num)));
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }

       return sum; 
    }
}