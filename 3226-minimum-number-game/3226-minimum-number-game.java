class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int ans[]=new int[nums.length];
        for(int n:nums){
            pq.offer(n);
        }
        int i=0;
        while(!pq.isEmpty()){
            int alice=pq.poll();
            int bob=pq.poll();
            ans[i]=bob;
            ans[i+1]=alice;
            i=i+2;
        }
    return ans; 
    }
}