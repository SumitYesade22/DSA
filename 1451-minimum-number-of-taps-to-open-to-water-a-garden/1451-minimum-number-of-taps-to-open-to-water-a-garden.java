class Solution {
    public int minTaps(int n, int[] ranges) {
        int startend[]=new int[ranges.length];
        Arrays.fill(startend,0);
        for(int i=0;i<startend.length;i++){
            int st=Math.max(0,i-ranges[i]);
            int ed=Math.min(n,i+ranges[i]);
            startend[st]=Math.max(ed,startend[st]);
        }
        int ce=0;
        int me=0;
        int ans=0;
        for(int i=0;i<startend.length;i++){
             if (i > me) return -1;
            
            me = Math.max(me, startend[i]);
            
            if (i == ce) { 
                if (ce != n) {
                    ans++;
                    ce = me;
                }
            }
        }
    return ans;
    }
}