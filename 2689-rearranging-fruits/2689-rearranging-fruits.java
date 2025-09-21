class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Arrays.sort(basket1);
        Arrays.sort(basket2);

        HashMap<Integer, Integer> mp = new HashMap<>();

     
        for (int i = 0; i < basket1.length; i++) {
            mp.put(basket1[i], mp.getOrDefault(basket1[i], 0) + 1);
            mp.put(basket2[i], mp.getOrDefault(basket2[i], 0) - 1);
        }

        List<Integer> extras = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int fruit = entry.getKey();
            int freq = entry.getValue();

            minVal = Math.min(minVal, fruit);

          
            if (freq % 2 != 0) {
                return -1;
            }

         
            for (int i = 0; i < Math.abs(freq) / 2; i++) {
                extras.add(fruit);
            }
        }

    
        Collections.sort(extras);

        long cost = 0;
        int m = extras.size();

        
        for (int i = 0; i < m / 2; i++) {
            int fruit = extras.get(i);
            cost += Math.min(fruit, 2 * minVal);
        }

        return cost;
    }
}
