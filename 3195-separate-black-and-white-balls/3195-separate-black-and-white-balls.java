class Solution {
    public long minimumSteps(String s) {
        long b=0;
        long a=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                b++;
            }else{
                a+=b;
            }

        }
        return a;
    }
}