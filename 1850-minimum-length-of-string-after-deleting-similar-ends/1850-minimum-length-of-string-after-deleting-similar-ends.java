class Solution {
    public int minimumLength(String s) {
        int st = 0, ed = s.length() - 1;

        while (st < ed && s.charAt(st) == s.charAt(ed)) {
            char c = s.charAt(st);

         
            while (st <= ed && s.charAt(st) == c) {
                st++;
            }

            
            while (st <= ed && s.charAt(ed) == c) {
                ed--;
            }
        }

        return ed - st + 1; 
    }
}
