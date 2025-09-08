class node implements Comparable<node>{
    int a;
    int b;
    node(int a,int b){
        this.a=a;
        this.b=b;

    }
    public int compareTo(node that){
        if(this.a==that.a){
            return this.b-that.b;
        }
        return this.a-that.a;
    }

}


class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<node>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
           pq.offer(new node(nums[i],i));
        }
        while(k!=0){
            node Node=pq.poll();
            nums[Node.b]=Node.a*multiplier;
            pq.offer(new node(nums[Node.b],Node.b));
            k--;
        }
    return nums;   
    }
}