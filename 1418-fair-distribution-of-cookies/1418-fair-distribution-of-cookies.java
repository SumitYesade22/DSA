class Solution {
    int ans=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        
        int a[]=new int[k];
        backtracking(cookies,a,0,k);
        return ans;
        
    }
    public void backtracking(int[] cookies,int[] a,int i,int k){
        if(i==cookies.length){
            int max=Integer.MIN_VALUE;
            for(int n:a){
                max=Math.max(max,n);
            }
            ans=max<ans?max:ans;
            return;
        }
        for(int j=0;j<k;j++){
            a[j]+=cookies[i];
            backtracking(cookies,a,i+1,k);
            a[j]-=cookies[i];

        }
    }
}