class Solution {
    public boolean checkIfPangram(String sentence) {
       HashSet<Character> map=new HashSet<>();
       for(char ch:sentence.toCharArray()){
        map.add(ch);
       }
       return map.size()==26;

    }
}