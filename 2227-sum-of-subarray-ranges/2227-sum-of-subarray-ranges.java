class Solution {
     public int[] getNSL(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return result;
    }

    public int[] getNSR(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return result;
    }
     public int[] getmaxNSL(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return result;
    }

    public int[] getmaxNSR(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return result;
    }
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int[] nsl=getNSL(nums,n);
        int[] nsr=getNSR(nums,n);
        int[] bignsl=getmaxNSL(nums,n);
        int[] bignsr=getmaxNSR(nums,n);
        long gsum=0;
        long msum=0;
        for(int i=0;i<n;i++){
           gsum+=(long)(i-bignsl[i])*(bignsr[i]-i)*nums[i];
           msum+=(long)(i-nsl[i])*(nsr[i]-i)*nums[i];
        }

        return gsum-msum;
    }
}