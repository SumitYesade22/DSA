class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] closestright = new int[n];
        int[] closestleft = new int[n];

        int lastR = -1;
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                lastR = i;
            } else if (dominoes.charAt(i) == 'L') {
                lastR = -1; 
            }
            closestright[i] = lastR;
        }

 
        int lastL = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                lastL = i;
            } else if (dominoes.charAt(i) == 'R') {
                lastL = -1; 
            }
            closestleft[i] = lastL;
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = dominoes.charAt(i);
            if (c == '.') {
                int left = closestright[i];
                int right = closestleft[i];

                if (left == -1 && right == -1) {
                    sb.append('.');
                } else if (left == -1) {
                    sb.append('L');
                } else if (right == -1) {
                    sb.append('R');
                } else {
                    int distL = Math.abs(i - left);
                    int distR = Math.abs(right - i);
                    if (distL == distR) {
                        sb.append('.');
                    } else if (distL < distR) {
                        sb.append('R');
                    } else {
                        sb.append('L');
                    }
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
