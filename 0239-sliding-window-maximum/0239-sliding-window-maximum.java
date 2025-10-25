class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer>que=new ArrayDeque<>();
        int i=0;
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int st=0;
        int j=0;
        
        while(i<n){
           
            while(!que.isEmpty() && que.peekLast()<nums[i]){
                que.pollLast();
            }
             que.offer(nums[i]);
             if(i-j+1==k){
               ans[st++]=que.peek();
               if(nums[j]==que.peek()){
                   que.pollFirst();

               }
               j++;
             }
        i++;
        }
      return ans;  
    }
}