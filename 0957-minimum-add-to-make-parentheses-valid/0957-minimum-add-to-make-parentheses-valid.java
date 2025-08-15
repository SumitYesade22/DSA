class Solution {
    public int minAddToMakeValid(String s) {
        char str[] = s.toCharArray();
        int open=0;
        int close=0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='('){
                open++;
            }else{
                if(open <= 0){
                    close++;
                }else{
                    open--;
                }
            }
            
        }
    return (open+close);
    }
}