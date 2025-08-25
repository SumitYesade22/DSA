class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String ans = s;
            
            for (int i = 0; i < s.length(); i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if (rotated.compareTo(ans) < 0) {
                    ans = rotated;
                }
            }
            return ans;
        } else {
            
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}
