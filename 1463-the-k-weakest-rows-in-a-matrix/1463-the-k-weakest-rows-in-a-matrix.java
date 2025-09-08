class node implements Comparable<node>{
    int s;
    int i;
    node(int s,int i){
        this.s=s;
        this.i=i;
    }
    public int compareTo(node that){
        if(this.s==that.s){
            return this.i-that.i;
        }
        return this.s-that.s;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]=new int[k];
        PriorityQueue<node>pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int n:mat[i]){
              sum+=n;  
            }
            pq.offer(new node(sum,i));
        }
        int i=0;
        while(k!=0){
            k--;
            ans[i]=pq.poll().i;
            i++;
        }
    return ans;   
    }
}