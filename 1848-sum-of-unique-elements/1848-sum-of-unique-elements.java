class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
       
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        int sum = 0;
       
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        
        return sum;
    }
}
