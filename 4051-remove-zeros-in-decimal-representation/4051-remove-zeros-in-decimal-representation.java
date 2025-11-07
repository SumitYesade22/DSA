class Solution {
    public long removeZeros(long n) {
        String num = Long.toString(n);
        String ans = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') {
                ans += num.charAt(i);
            }
        }
        return Long.parseLong(ans);
    }
}