class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       
        int mp[] = new int[nums.length+1];

        ArrayList<List<Integer>> result = new ArrayList<>();
        
        for (int c : nums) {
            
            if (mp[c] == result.size()) {
                result.add(new ArrayList<>());
            }

            result.get(mp[c]).add(c);
            mp[c]++;
        }

        return result;
    }
}