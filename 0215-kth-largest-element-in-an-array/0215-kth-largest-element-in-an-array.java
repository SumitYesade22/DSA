class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.offer(n);
        }
        int ans=0;
        while(k!=0){
          ans=pq.poll();
          k--;
        }
     return ans;   
    }
}