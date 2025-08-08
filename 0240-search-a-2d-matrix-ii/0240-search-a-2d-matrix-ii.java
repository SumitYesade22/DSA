class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0;
        int c = cols-1;
        while(r<rows && c >=0){
            if(matrix[r][c]==target){
                return true;
            }else if(target < matrix[r][c]){
              c=c-1;
            }else{
                r=r+1;
            }
        }
      return false;  
    }
}