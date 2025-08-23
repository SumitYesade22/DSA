class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int i = 0;
        int mainInd = 0;

        while (i < chars.length) {
            char c = chars[i];
            chars[mainInd++] = c;

            int count = 1;
            i++;
            while (i < chars.length && c == chars[i]) {
                count++;
                i++;
            }

            if (count > 1) {
                // Convert count into chars (for multi-digit counts like 12 → '1','2')
                String cntStr = String.valueOf(count);
                for (char digit : cntStr.toCharArray()) {
                    chars[mainInd++] = digit;
                }
            }
        }
        return mainInd;   
    }
}
