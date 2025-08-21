class Solution {
    public int titleToNumber(String columnTitle) {
        int p=0;
        long ans=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int ch=columnTitle.charAt(i)-64;
            ans += 1L*ch*Math.pow(26,p++);
        }
    return (int)ans;   
    }
}