class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int i = 0;

        while (i < str.length) {
            int startIndex = i;
            // find end of the word
            while (i < str.length && str[i] != ' ') {
                i++;
            }
            int endIndex = i - 1; // last char of the word
            reverse(str, startIndex, endIndex);

            i++; // skip space
        }
        return new String(str);
    }

    public void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
