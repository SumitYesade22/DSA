class Solution {
    public String reverseVowels(String s) {
        int st = 0;
        StringBuilder sb = new StringBuilder(s);
        int ed = s.length() - 1;

        while (st < ed) {
            while (st < ed && !isVowel(sb.charAt(st))) {
                st++;
            }
            while (st < ed && !isVowel(sb.charAt(ed))) {
                ed--;
            }
            if (st < ed) {
                char temp = sb.charAt(st);
                sb.setCharAt(st, sb.charAt(ed));
                sb.setCharAt(ed, temp);
                st++;
                ed--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
