class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> s=new HashSet<>();
        for(String m:dictionary){
            s.add(m);
        }
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length();j++){
                if(s.contains(arr[i].substring(0,j))){
                    arr[i]=arr[i].substring(0,j);
                }
            }
        }
       String a=String.join(" ",arr); 
       return a;
    }
}