class Solution {
    public String countAndSay(int n) {
       if(n==1){
        return "1";
       }
       String ans=countAndSay(n-1);
       int count=0;
       String res="";
       for(int i=0;i<ans.length();i++){
        char s=ans.charAt(i);
        count++;
        if(i==ans.length()-1 || s!=ans.charAt(i+1)){
            res=res+count+s;
            count=0;
        }
       }
       return res;
    }
}