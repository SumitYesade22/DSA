class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            String seq=stringSeq(str);
             if(map.containsKey(seq)){
            map.get(seq).add(str);
        }else{
           map.put(seq,new ArrayList<>());
           map.get(seq).add(str); 
        }
        }
       
     return new ArrayList(map.values());   
    }
    public String stringSeq(String str) {
    // Frequency buckets for 26 lowercase letters
    int[] freq = new int[26];

    // Iterate over each character and count frequencies
    for (char c : str.toCharArray()) {
        freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder frequencyString = new StringBuilder();
    char c = 'a';
    for (int i : freq) {
        frequencyString.append(c);
        frequencyString.append(i);
        c++;
    }

    return frequencyString.toString();
}

}