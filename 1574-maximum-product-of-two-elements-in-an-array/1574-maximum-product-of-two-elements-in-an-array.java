class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            ans.offer(n);
        }

        return((ans.poll()-1)*(ans.poll()-1));

        
    }
}