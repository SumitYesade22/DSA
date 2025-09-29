class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        
        for (int start = 1; start <= 9; start++) {
            int num = start;
            int nextDigit = start;
            
            while (num <= high && nextDigit <= 9) { 
                if (num >= low) ans.add(num);
                nextDigit++;
                if (nextDigit > 9) break; 
                num = num * 10 + nextDigit;
            }
        }
        
        Collections.sort(ans); 
        return ans;
    }
}
