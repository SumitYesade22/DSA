class node implements Comparable<node>{
    int a;
    int b;
    node(int a ,int b){
        this.a=a;
        this.b=b;
    }
    public int compareTo(node that){
        return this.b-that.b;
    }
}


class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<node>pq=new PriorityQueue<>();
        int ut[]=new int[k];
        int ans[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            ans[i][0]=nums[i];
            ans[i][1]=i;
        }
        Arrays.sort(ans,(a,b)->Integer.compare(b[0],a[0]));
        for(int j=0;j<k;j++){
          pq.offer(new node(ans[j][0],ans[j][1]));
        }
        int i=0;
        while(!pq.isEmpty()){
            ut[i]=pq.poll().a;
            i++;
        }
    return ut;  
    }
}