class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        int i=0;
        int j=n-1;
        int s=0;
        int maxScore=0;
        while(i<=j){
           if(power>=tokens[i]){
            s++;
            power-=tokens[i];
            i++;
            maxScore = Math.max(maxScore, s);
           }else if(s>0){
            s--;
            power+=tokens[j];
            j--;
           }else{
            break;
           }
        }
     return maxScore;   
    }
}