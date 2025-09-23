class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

     
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

       
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0) {
                result.add(n);
                map.put(n, map.get(n) - 1); 
            }
        }

       
        return result.stream().mapToInt(i -> i).toArray();
    }
}
