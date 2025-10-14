class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * n - 2;     // One full back-and-forth trip
        int t = time % cycle;      // Effective time within cycle
        
        if (t < n) {
            return t + 1;          // Moving forward
        } else {
            return n - (t - (n - 1)); // Moving backward
        }
    }
}
