class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = 0, s2 = 0;   
        int c1 = 0, c2 = 0;    

        for (int x : nums1) {
            s1 += x;
            if (x == 0) c1++;
        }
        for (int x : nums2) {
            s2 += x;
            if (x == 0) c2++;
        }

       
        long min1 = s1 + c1;
        long min2 = s2 + c2;

        if (min1 == min2) return min1;


        if (c1 == 0 && min1 < min2) return -1;


        if (c2 == 0 && min2 < min1) return -1;

 
        return Math.max(min1, min2);
    }
}
