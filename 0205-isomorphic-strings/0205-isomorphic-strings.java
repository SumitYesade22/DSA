class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char arr[] = new char[256];          // s → t mapping
        boolean used[] = new boolean[256];   // track used characters in t

        for (int i = 0; i < s.length(); i++) {
            int si = s.charAt(i);
            int ti = t.charAt(i);

            if (arr[si] == 0) {  // not mapped yet
                if (used[ti]) {  // t[i] already used by another s[i]
                    return false;
                }
                arr[si] = t.charAt(i);
                used[ti] = true;
            } else if (arr[si] != t.charAt(i)) {  // mapped but mismatch
                return false;
            }
        }

        return true;
    }
}
