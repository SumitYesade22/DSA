class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) {
            return "";
        }

        char[] arr = palindrome.toCharArray();  
        int i = 0;
        for (i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';   
                return new String(arr); 
            }
        }

        
        arr[n - 1] = 'b';
        return new String(arr);
    }
}
