class Solution {
    public int minimumLength(String s) {
        int ans[]=new int[26];
        for(char ch:s.toCharArray()){
            ans[ch-'a']++;
        }
        int sum=0;
        for(int n:ans){
            if(n==0){
                continue;
                
            }else if(n%2==0){
                sum+=2;
            }else{
                sum+=1;
            }
        }
     return sum;   
    }
}