class Solution {
    public String intToRoman(int num) {
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int len=arr.length;
        StringBuilder ans=new StringBuilder();
        String sym[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while(num!=0){
            int i=0;
            while(i<13 && arr[i]>num){
               i++;
            }
            num=num-arr[i];
            ans.append(sym[i]);
        }
    return ans.toString();
    }
}