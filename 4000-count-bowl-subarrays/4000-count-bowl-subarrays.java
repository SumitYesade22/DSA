class Solution {
    public long bowlSubarrays(int[] nums) {
        int n=nums.length;
        int[] nsl=getmaxNSL(nums,n);
        int[] nsr=getmaxNSR(nums,n);
        long ans=0;
        for(int i=0;i<n;i++){
            if(nsl[i]==-1 || nsr[i]==n){
                continue;
            }
            ans++;
        }
        return ans;
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
}