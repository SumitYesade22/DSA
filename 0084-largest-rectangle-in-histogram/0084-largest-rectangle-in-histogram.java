class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] arr1 = findnextsmall(heights);
        int[] arr2 = findprevsmall(heights);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr1.length ; i++){
        int area=(arr1[i]-arr2[i]-1)*heights[i];
        max=Math.max(max,area);
        }
        return max;
    }
    public int[] findnextsmall(int[] heights){
        Stack<Integer> stack = new Stack<Integer>();
        int n = heights.length;
        int[] res=new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
             res[i]=stack.peek();
            }else{
             res[i]=n;
            }
            stack.push(i);
        }
        return res;
    }
       public int[] findprevsmall(int[] heights){
        Stack<Integer> stack = new Stack<Integer>();
        int n = heights.length;
        int[] res=new int[n];
        for(int i = 0 ; i < n ; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
             res[i]=stack.peek();
            }else{
             res[i]=-1;
            }
            stack.push(i);
        }
        return res;
    }
}