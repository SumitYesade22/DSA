class Solution {
   
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int beautifulSubstrings(String s, int k) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int vowel = 0;
            int cons = 0;

            for (int j = i; j < n; j++) {
                if (isVowel(s.charAt(j))) {
                    vowel++;
                } else {
                    cons++;
                }

               
                if (vowel == cons && (vowel * cons) % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
