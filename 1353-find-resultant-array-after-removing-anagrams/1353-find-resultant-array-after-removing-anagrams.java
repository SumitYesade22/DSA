class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String>ans=new ArrayList<>();
         if (words.length == 0) return ans;
        for(String word:words){
            ans.add(word);
        }
        int i=1;
        int n=ans.size();
        while(i<ans.size()){
            if(anagram(ans.get(i),ans.get(i-1))){
                ans.remove(i);
            }else{
                i++;
            }
        }
    return ans;  
    }
    public boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}