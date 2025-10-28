class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        if(n==0){
            return new ArrayList<>();
        }
        
        int i=1;
        List<String>ans=new ArrayList<>();
        while(i<=n){
            int count=1;
            int prev=nums[i-1];
            while(i<n && nums[i]==prev+1){
                prev=nums[i];
                i++;
                count++;
            }
            if(count==1){
                ans.add(String.valueOf(prev));
                
            }else{
                ans.add(nums[i-count]+"->"+nums[i-1]);
            }
            i++;
        }
        return ans;
    }
}