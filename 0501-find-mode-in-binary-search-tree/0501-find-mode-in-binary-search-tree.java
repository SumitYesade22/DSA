class Solution {
    public int[] findMode(TreeNode root) {
        if(root == null){
            return new int[0];
        }

        Map<Integer, Integer> freq = new HashMap<>();
        inorder(root, freq);

        int maxFreq = 0;
        for(int val : freq.values()){
            maxFreq = Math.max(maxFreq, val);
        }

        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            if(e.getValue() == maxFreq){
                res.add(e.getKey());
            }
        }

        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }

    public void inorder(TreeNode root, Map<Integer,Integer> freq){
        if(root == null) return;

        inorder(root.left, freq);
        freq.put(root.val, freq.getOrDefault(root.val, 0) + 1);
        inorder(root.right, freq);
    }
}
