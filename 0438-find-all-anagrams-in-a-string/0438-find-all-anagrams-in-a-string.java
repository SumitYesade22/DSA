class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sarr[]=new int[26];
        int parr[]=new int[26];
        List<Integer>ans=new ArrayList<>();
        for(char ch:p.toCharArray()){
            parr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            sarr[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sarr[s.charAt(i-p.length())-'a']--;
            }
        if(Arrays.equals(sarr,parr)){
            ans.add(i-p.length()+1);
        }
        }
        return ans;
    }
}