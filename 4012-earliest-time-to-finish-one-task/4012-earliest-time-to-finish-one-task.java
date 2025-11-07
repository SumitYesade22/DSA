class Solution {
    public int earliestTime(int[][] tasks) {
        PriorityQueue<Integer>ans=new PriorityQueue<>();
        for(int i=0;i<tasks.length;i++){
            int ad=tasks[i][0]+tasks[i][1];
            ans.offer(ad);
        }

      return ans.peek();  
    }
}