class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int x = horizontalCut.length;
        int y = verticalCut.length;
        
        Arrays.sort(horizontalCut); 
        Arrays.sort(verticalCut);  

        int i = x - 1, j = y - 1; 
        int horizontalPieces = 1, verticalPieces = 1;
        int result = 0;

        while (i >= 0 && j >= 0) {
            if (horizontalCut[i] >= verticalCut[j]) {
                result += horizontalCut[i] * verticalPieces;
                horizontalPieces++;
                i--;
            } else {
                result += verticalCut[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }

        while (i >= 0) {
            result += horizontalCut[i] * verticalPieces;
            horizontalPieces++;
            i--;
        }

        while (j >= 0) {
            result += verticalCut[j] * horizontalPieces;
            verticalPieces++;
            j--;
        }

        return result;
    }
}