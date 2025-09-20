class Solution {
    public int minDeletions(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int ans[]=new int[26];
        for(int i=0;i<n;i++){
            char ch=arr[i];
            ans[ch-'a']++;
        }
        int d=0;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<ans.length;i++){
            while(set.contains(ans[i]) && ans[i]!=0){
                d++;
                ans[i]--;
            }
            set.add(ans[i]);
        }
     return d;   
    }
}