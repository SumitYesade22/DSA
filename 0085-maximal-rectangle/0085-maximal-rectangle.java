class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] heights = new int[matrix[0].length];
        int max=0;
        for(int i =0 ; i< matrix.length ; i++){
            for(int j=0 ; j < matrix[i].length ; j++){
                int val=matrix[i][j]-'0';
                if(val==0){
                    heights[j]=0;
                }else{
                    heights[j]+=val;
                }
            }
            int maxarea=largestRectangleArea(heights);
            max=Math.max(maxarea,max);
        }
        return max;
        
    }
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