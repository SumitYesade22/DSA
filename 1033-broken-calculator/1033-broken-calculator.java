class Solution {
    public int brokenCalc(int startValue, int target) {
        int op=0;
        if(startValue==target){
            return op;
        }
        while(target>=startValue){
            target/=2;
            op++;
        }
        
        while(startValue!=target){
            op++;
            target++;
        }
       return op; 
    }
}