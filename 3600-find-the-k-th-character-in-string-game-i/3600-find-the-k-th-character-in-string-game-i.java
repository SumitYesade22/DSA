class Solution {
    public char kthCharacter(int k) {
        return rec(k, new StringBuilder("a"));
    }

    private char rec(int k, StringBuilder ans) {
        
        if (ans.length() >= k) {
            return ans.charAt(k - 1);
        }

       
        int currentLength = ans.length();
        for (int i = 0; i < currentLength; i++) {
            char ch = (char)(ans.charAt(i) + 1);
            ans.append(ch);
        }

        
        return rec(k, ans);
    }
}
