class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer>rank=new HashMap<>();
        int n=arr.length;
        int ans[]=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int r=1;
        for(int m:arr){
            if(!rank.containsKey(m)){
                rank.put(m,r);
                r++;
            }
        }
       for (int i = 0; i < ans.length; ++i)
          ans[i] = rank.get(ans[i]);
        return ans;

        
    }
}