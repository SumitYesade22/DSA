class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<10;i++){
            if(i>n){
                break;
            }
            dfs(i,n,ans);
        }
    return ans;    
    }
    public void dfs(int curr,int target,List<Integer>ans){
        if(curr>target){
            return;
        }
        ans.add(curr);
        for(int i=0;i<10;i++){
             dfs(curr*10+i,target,ans);
        }

        
    }
}