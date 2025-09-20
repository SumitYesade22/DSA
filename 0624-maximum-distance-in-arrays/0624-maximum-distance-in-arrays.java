class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n=arrays.size();
        int dif=0;
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int min=arrays.get(0).get(0);
        for(int i=1;i<n;i++){
            dif=Math.max(dif,Math.abs(max-arrays.get(i).get(0)));
            dif=Math.max(dif,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min));
            max=Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
            min=Math.min(min,arrays.get(i).get(0));

        }
     return dif;   
    }
}