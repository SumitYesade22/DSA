class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }

        return rec(arr,n,k,0);
        
        
    }
    public int rec(ArrayList<Integer> arr,int n,int k,int st){
        if(arr.size()==1){
            return arr.get(0);
        }
        int idx=(st+k-1)%arr.size();
        arr.remove(idx);

        return rec(arr,n,k,idx);

    }
}