class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char []one=s.toCharArray();
        char []two=t.toCharArray();
        int max=Integer.MIN_VALUE;
        int start=0;
        int d=0;
        for(int i=0;i<one.length;i++){
           char a=one[i];
           char b=two[i];
           d+=Math.abs(a-b);

           while( d>maxCost){
             int diff=Math.abs(one[start]-two[start]);
             d-=diff;
             start++;           }
            max=Math.max(max,i-start+1);
        }

      
       return max; 
    }
}