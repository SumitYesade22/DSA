class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int num:answers){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int num:m.keySet()){
            int groupSize=num+1;
            int val=m.get(num);
            int groups = (int) Math.ceil((double) val / groupSize);
            ans+=groupSize*groups;
        }

        return ans;
    }
}