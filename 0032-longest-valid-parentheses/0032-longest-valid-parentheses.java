class Solution {
    public int longestValidParentheses(String s) {
        Stack <Integer> stack = new Stack<>();
      for(int i = 0 ; i < s.length() ; i++){
        if(s.charAt(i)=='('){
            stack.push(i);
        }else{
            if( stack.isEmpty() || s.charAt(stack.peek())==')' ){
                stack.push(i);
            }else{
                stack.pop();
            }
        }
      }
      if(stack.isEmpty()){
        return s.length();
      }
        ArrayList<Integer> arr = new ArrayList<>();
       formArrayOfInvalidIndexes(arr, stack, s);

       int max=0;
       for(int m =1 ; m<arr.size();m++){
        int prev=arr.get(m-1);
        max=Math.max(max,arr.get(m)-prev-1);
       }
       return max;
    }
    public void formArrayOfInvalidIndexes(ArrayList<Integer> arr, Stack<Integer> stack, String s) {
         arr.add(0,s.length());
        
        while(!stack.isEmpty()){
            arr.add(0,stack.pop());
        }
         arr.add(0,-1);
    }
}