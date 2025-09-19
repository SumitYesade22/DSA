class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer>set=new HashSet<>();
        for(int o:banned){
            set.add(o);
        }
        int m=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                continue;
            }
            sum+=i;
            if(sum<=maxSum){
                m++;
            }else{
                break;
            }
        }
       return m; 
    }
}