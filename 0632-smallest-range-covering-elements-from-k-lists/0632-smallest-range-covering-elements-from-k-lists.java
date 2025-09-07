class node implements Comparable<node>{
    int el;
    int listindex;
    int i;
    node(int el,int listindex,int i){
        this.el=el;
        this.listindex=listindex;
        this.i=i;
    }
    public int compareTo(node that){
        return this.el-that.el;
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue <node> pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            pq.offer(new node(nums.get(i).get(0),i,0));
            max=Math.max(max,nums.get(i).get(0));

        }
        int[] ans={-10000000,10000000};

        while(!pq.isEmpty()){
            node min=pq.poll();
            if(max-min.el<ans[1]-ans[0]){
                ans[0]=min.el;
                ans[1]=max;
            }

            if(min.i+1<nums.get(min.listindex).size()){
                int nextElement = nums.get(min.listindex).get(min.i + 1);
                pq.offer(new node(nextElement, min.listindex, min.i + 1));
                max = Math.max(max, nextElement);
            }else{
                break;
            }
            
        }
    return ans; 
    }
}