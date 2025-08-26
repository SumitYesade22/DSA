
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();
        Set<Integer> players = new HashSet<>();
        
       
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            
            players.add(winner);
            players.add(loser);
            
            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }
        
        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        
       
        for (int player : players) {
            int lossCount = losses.getOrDefault(player, 0);
            if (lossCount == 0) {
                noLoss.add(player);
            } else if (lossCount == 1) {
                oneLoss.add(player);
            }
        }
        
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(noLoss);
        result.add(oneLoss);
        
        return result;
    }
}
