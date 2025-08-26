class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        TreeMap<Integer,Integer> m=new TreeMap<>();

        for(int n:hand){
         m.put(n,m.getOrDefault(n,0)+1);
        }
       while(!m.isEmpty()){
        int e=m.firstKey();
        for(int i=0;i<groupSize;i++){
            if(!m.containsKey(e+i)){
                return false;
            }

            m.put(e+i,m.get(e+i)-1);
            if(m.get(e+i)==0){
                m.remove(e+i);
            }
        }
       }
     return true;   
    }
}