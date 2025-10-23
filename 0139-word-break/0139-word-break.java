class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean>mp=new HashMap<>();
        
        HashSet<String>ans=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            ans.add(wordDict.get(i));
        }
        Boolean a=solve(mp,s,wordDict,ans);
        return a;
        
        
    }
    public boolean solve(HashMap<String,Boolean>mp,String s,List<String>wordDict,HashSet<String>ans){
        if (s.length() == 0) {
    return true;
}
        if(mp.containsKey(s)){
            return mp.get(s);
        }
        for(int i=0;i<s.length();i++){
            String prefix=s.substring(0,i+1);
            String suffix=s.substring(i+1,s.length());
            if((ans.contains(prefix)&& ans.contains(suffix)) ||( ans.contains(prefix)&&solve(mp,suffix,wordDict,ans))){
                mp.put(s,true);
                return true;
            }
        }
        mp.put(s,false);
        return false;
    }
}