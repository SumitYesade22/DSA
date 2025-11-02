class node implements Comparable<node>{
    int d;
    int n;
    node(int d,int n){
        this.d=d;
        this.n=n;
    }
    public int compareTo(node that){
        if(this.d==that.d){
            return this.n-that.n;
        }
        return this.d- that.d;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<node>pq=new PriorityQueue<>();
        for(int a : arr){
            int diff=Math.abs(a-x);
            pq.offer(new node(diff,a));
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty() && k>0){
            node nw=pq.poll();
            ans.add(nw.n);
            k--;
        }
        Collections.sort(ans);
                return ans;
    }
}