
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        
        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
       
        int size = Math.min(list.size(), k);
        int[] res = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}