class Solution {
    public int minNumberOperations(int[] target) {
        int op=0;
        int n=target.length;
        int prev=0;
        for(int i=0;i<n;i++){
        int curr=target[i];
        if(curr>prev){
            op+=curr-prev;
        }
        prev=curr;
        }
        return op;
    }
}