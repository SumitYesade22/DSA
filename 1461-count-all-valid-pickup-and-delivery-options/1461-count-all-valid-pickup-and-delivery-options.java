class Solution {
    int res=1;
    int MOD=1000_000_007;
    public int countOrders(int n) {
        int a=1;
        res=recursion(n);
        return res%MOD;
    }
    public int recursion(int n){
        if(n==1){
            return 1;
        }
        long ans=1;
        long spaces=(n-1)*2+1;
        long p=spaces*(spaces+1)/2;
        ans = p%MOD*recursion(n-1)%MOD;
        return (int)ans%MOD;
    }
}