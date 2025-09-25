class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> ans = new ArrayList<>();
        int l = 1;

        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {

                if (l == 1) {  
                    curr.add(triangle.get(i).get(j));
                    continue;  
                } else {
                    int a = triangle.get(i).get(j);

                    if (j == 0) {
                    
                        curr.add(a + ans.get(i - 1).get(j));
                    } else if (j == triangle.get(i).size() - 1) {
                       
                        curr.add(a + ans.get(i - 1).get(j - 1));
                    } else {
                        
                        int prev = ans.get(i - 1).get(j - 1);
                        int next = ans.get(i - 1).get(j);
                        curr.add(a + Math.min(prev, next));
                    }
                }
            }
            ans.add(curr);  
            l++;
        }

  
        List<Integer> lastRow = ans.get(ans.size() - 1);
        int min = Integer.MAX_VALUE;
        for (int val : lastRow) {
            min = Math.min(min, val);
        }

        return min;
    }
}
