class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(ans.length()>0 && ch<ans.charAt(ans.length()-1) && k>0){
                ans.deleteCharAt(ans.length()-1);
                k--;
            }
            ans.append(ch);
        }
        int i=0;
      
        while(ans.length()>0 && ans.charAt(i)=='0'){
            ans.deleteCharAt(i);
        }
        while(ans.length()>0 && k!=0){
             ans.deleteCharAt(ans.length()-1);
             k--;
        }
     return ans.toString().length()==0?"0":ans.toString();   
    }
}