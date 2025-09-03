class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int num[]=new int[26];
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            num[s.charAt(i)-'a']=i;
        }
        int i=0;
        int start=0;
        int end=0;
        while(i<n){
            end=Math.max(end,num[s.charAt(i)-'a']);
            if(end==i){
                int d=end-start+1;
                ans.add(d);
                if(end!=n-1){
                  start=end+1;
                }
                

            }
            i++;
        }
        return ans;
    }
}