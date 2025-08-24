class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] one=new int[26];
        int[] two=new int[26];
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            int index=c-97;
            one[index]++;
        }
         for(int i=0;i<word2.length();i++){
            char c=word2.charAt(i);
            int index=c-97;
            two[index]++;
        }
        for(int i=0;i<one.length;i++){
            if((one[i]==0 && two[i]==0) || (one[i]!=0 && two[i]!=0)){
                continue;
            }else{
                return false;
            }
        }
        Arrays.sort(one);
        Arrays.sort(two);
        for(int i=0;i<one.length;i++){
            if(one[i]!=two[i]){
                return false;
            }
        }
    return true;  
    }
}