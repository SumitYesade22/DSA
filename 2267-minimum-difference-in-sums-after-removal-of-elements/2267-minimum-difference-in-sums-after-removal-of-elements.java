class Solution {
    public long minimumDifference(int[] nums) {
        int n=nums.length;
        int r=n/3;
        long left[]=new long[n];
        long right[]=new long[n];
        PriorityQueue<Long>minpq=new PriorityQueue<>();
        PriorityQueue<Long>maxpq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int i=0;i<n;i++){
           sum+=nums[i];
           maxpq.offer((long)nums[i]);
           while(maxpq.size()>r){
            long node=maxpq.poll();
            sum-=node;
           }
           left[i]=sum;
        }
        sum=0;
        for(int j=n-1;j>=0;j--){
            sum+=nums[j];
            minpq.offer((long)nums[j]);
            while(minpq.size()>r){
                long node=minpq.poll();
                sum-=node;
            }
            right[j]=sum;
        }
        long minsum=Long.MAX_VALUE;
        for(int m=r-1;m<n-r;m++){
            long a=left[m];
            long b=right[m+1];
            long dif=a-b;
            minsum=Math.min(minsum,dif);
        }
     return minsum;   
    }
}