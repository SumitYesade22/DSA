class Solution {
    public int minSwaps(String s) {
        Stack <Character> stack = new Stack<Character>();
        for(int i =0 ; i<s.length();i++){
            if(s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty() || stack.peek()==']'){
                    stack.push(s.charAt(i));
                }else{
                    stack.pop();
                }
            }
        }
        int length=stack.size();
        int closedbrackets = length/2;
        return ((closedbrackets+1)/2);
        
        
    }
}