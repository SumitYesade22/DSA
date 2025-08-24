class Solution {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder("");
        int i=0;
        while(i<word.length()){
        char ch=word.charAt(i);
        int count=1;
          while(i+1<word.length() && word.charAt(i+1)==ch){
            count++;
            i++;
          }
          i++;
          
         
          while(count>9){
             count=count-9;
            comp.append(9).append(ch);
          }
            comp.append(count).append(ch);
          
          

        }
        
     return comp.toString();   
    }
}