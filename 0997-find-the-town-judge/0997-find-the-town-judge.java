class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[] = new int[n + 1];
        int in[] = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int id = trust[i][0];
            int num = trust[i][1];

            in[id]++;   
            arr[num]++;   
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i] == n - 1 && in[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
