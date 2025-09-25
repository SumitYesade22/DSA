class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a=new StringBuilder(s);
        StringBuilder b=new StringBuilder(t);
        Stack<Character>st=new Stack<>();
        Stack<Character>st1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                   st.pop();
                }
                
            }
        }
            for(char c:t.toCharArray()){
            if(c!='#'){
                st1.push(c);
            }else{
                 if(!st1.isEmpty()){
                   st1.pop();
                }
            }
        }
        while(!st.isEmpty()){
            if(st1.isEmpty()){
                return false;
            }
            if(st.pop()!=st1.pop()){
                return false;
            }
        }
     if(!st1.isEmpty()){
        return false;
     }
     return true;   
    }
}