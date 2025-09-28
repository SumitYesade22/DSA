class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>ans=new ArrayList<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int i=0;
        for(int n:groupSizes){
             map.putIfAbsent(n,new ArrayList<>());
            map.get(n).add(i);
            if(map.containsKey(n)){
                int len=map.get(n).size();
                if(len==n){
                    ans.add(new ArrayList<>(map.get(n)));
                    map.remove(n);
                }
            }
           
            i++;
        }
        return ans;
    }
}