class Solution {
    public int maxVowels(String s, int k) {
        int v=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<k;i++){
           if(isVowel(arr[i])){
            v++;
           }
        }
        int maxint=v;
        for(int j=1;j<=arr.length-k;j++){
            if(isVowel(arr[j-1])){
                v--;
            }
            if(isVowel(arr[j+k-1])){
                v++;
            }
        maxint=Math.max(maxint,v);
        }
    return maxint;  
    }
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}