class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n * m];

        int row = 0, col = 0;
        boolean up = true;
        int i = 0;

        while (i < n * m) {
            ans[i++] = mat[row][col];

            if (up) {
                if (col == m - 1) {  
                    row++;
                    up = false;
                } else if (row == 0) { 
                    col++;
                    up = false;
                } else {              
                    row--;
                    col++;
                }
            } else {
                if (row == n - 1) {   
                    col++;
                    up = true;
                } else if (col == 0) { 
                    row++;
                    up = true;
                } else {              
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}
