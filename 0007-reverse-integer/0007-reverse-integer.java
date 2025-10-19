class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
        }

        x = Math.abs(x);
        int num = 0;

        while (x > 0) {
            int digit = x % 10;
            
            
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return 0; 
            }

            num = num * 10 + digit;
            x = x / 10;
        }

        if (neg) {
            num = -num;
        }

        return num;
    }
}
