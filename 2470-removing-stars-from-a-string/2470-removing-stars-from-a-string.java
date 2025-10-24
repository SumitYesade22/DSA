class Solution {
    public String removeStars(String s) {
        int n=s.length();
        StringBuilder r=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                if(st.isEmpty()){
                    continue;
                }else{
                    st.pop();
                }
            }else{
                st.push(s.charAt(i));
            }

        }
        while(!st.isEmpty()){
            r.append(st.pop());
        }
        r.reverse();
        return r.toString();
        
    }
}