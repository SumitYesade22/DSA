class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        String sh=s.toLowerCase();
        int ans=0;
        int mid=(len/2)-1;
        int i=mid;
        int j=mid+1;
        while(i>=0){
            char c=sh.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                ans++;
            }
            i--;
             c=sh.charAt(j);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                ans--;
            }
            j++;

        }
    return ans==0;  
    }
}