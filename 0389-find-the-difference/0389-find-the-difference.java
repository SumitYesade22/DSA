class Solution {
    public char findTheDifference(String s, String t) {
        int ans = 0;
        for (char ch : t.toCharArray()) {
            ans += ch;
        }
        for (char ch : s.toCharArray()) {
            ans -= ch;
        }
        return (char) ans;
    }
}
