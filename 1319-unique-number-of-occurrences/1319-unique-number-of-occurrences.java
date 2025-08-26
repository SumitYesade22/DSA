class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> ans=new HashMap<>();
        for(int a:arr){
            ans.put(a,ans.getOrDefault(a,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(Integer a:ans.values()){
            if(res.contains(a)){
                return false;
            }else{
          res.add(a);}
        }

        return true;
    }
}