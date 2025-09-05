class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.offer(n);

        }
       long sum=0;
        while(k!=0){
        int num=pq.poll();
        sum+=num;
        num=(int)Math.ceil(num/3.0);
        pq.offer(num);
        k--;
 
        }
        return sum;
    }
}