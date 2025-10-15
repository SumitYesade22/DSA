class Solution {
    public void reverseString(char[] s) {
        recursion(s,0,s.length-1);
        
    }
    public void recursion(char[] s,int st,int ed){
        if(st>ed){
            return ;
        }
        char temp=s[st];
        s[st]=s[ed];
        s[ed]=temp;
        recursion(s,st+1,ed-1);
    }
}