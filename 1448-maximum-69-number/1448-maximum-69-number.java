class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        char a[]=s.toCharArray();
        int i=0;
        for(char ch:a){
            if(ch!='9'){
                a[i]='9';
                break;
            }
            i++;
        }
        
       return Integer.parseInt(new String(a));
    }
}