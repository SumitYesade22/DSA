class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=n;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int newarray[]=new int[set.size()];
        int i=0;
        for(int ne:set){
             newarray[i++]=ne;
        }  
        Arrays.sort(newarray);
        int m=0;
        for(int j=0;j<newarray.length;j++){
            while(m<newarray.length && newarray[m]<newarray[j]+n){
                m++;
            }
            int in=m-j;
            ans=Math.min(ans,n-in);

        } 
        return ans;     
    }
}