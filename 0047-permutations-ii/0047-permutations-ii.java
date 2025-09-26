class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        boolean visited[]=new boolean[n];
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),visited,nums);
        return ans;
        
    }
    public void backtrack( List<List<Integer>>ans,List<Integer>temp,boolean visited[],int nums[]){
        if(temp.size()==nums.length && !ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
              if(visited[i]==true){
                continue;
              }
              visited[i]=true;
              temp.add(nums[i]);
              backtrack(ans,temp,visited,nums);
              visited[i]=false;
              temp.remove(temp.size()-1);
        }
    }
}