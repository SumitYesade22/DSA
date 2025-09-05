class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer>ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            ans.offer(num);
        }
        while(ans.size()>1){
        int y=ans.poll();
        int x=ans.poll();
        if(x==y){

            continue;
        }else{
            ans.offer(y-x);
        }
        }
    return ans.isEmpty()?0:ans.poll();  
    }
}