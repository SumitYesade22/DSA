class node implements Comparable<node>{
    int sum;
    int i;
    node(int sum,int i){
        this.sum=sum;
        this.i=i;
    }
    public int compareTo(node that){
        return this.sum-that.sum;
    }
}
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<node>pq=new PriorityQueue<>();
        int i=0;
        for(int num:nums){
        pq.offer(new node(num,i));
        i++;
        }
        int ans[]=new int[n*(n+1)/2];
        int j=0;
        while(!pq.isEmpty()){
            node ne=pq.poll();
            ans[j]=ne.sum;
            j++;
            if(ne.i+1<nums.length){
                ne.sum=ne.sum+nums[ne.i+1];
                ne.i+=1;
                pq.offer(ne);
            }
       

        }
        long sum = 0;
        int MOD = 1_000_000_007;
        for (int k = left - 1; k < right; k++) {
            sum = (sum + ans[k]) % MOD;
        }

        return (int) sum;
    }
}