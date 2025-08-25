class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        long count = 0;
        int mod = 1_000_000_007;

        int i = 0;
        while (i < n) {
            int j = i;

            
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int len = j - i;  
            count += (long) len * (len + 1) / 2;
            count %= mod;

            i = j; 
        }

        return (int) count;
    }
}
