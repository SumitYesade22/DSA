
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freq = new HashMap<>();
        
     
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }
        
        int rounds = 0;
        
        
        for (int count : freq.values()) {
            if (count == 1) {
                return -1; 
            }
            
            if (count % 3 == 0) {
                rounds += count / 3;
            } else {
                rounds += (count / 3) + 1;
            }
        }
        
        return rounds;
    }
}
