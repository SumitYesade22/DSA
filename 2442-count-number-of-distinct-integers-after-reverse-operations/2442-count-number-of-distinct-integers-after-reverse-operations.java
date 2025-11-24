class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>un=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            un.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int rev=solve(nums[i]);
            un.add(rev);
        }
       return un.size(); 
    }
    public int solve(int num){
        int re=0;
        while(num>0){
            int temp=num%10;
            re=re*10+temp;
            num=num/10;
        }
        return re;
    }
}