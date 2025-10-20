class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int h=Math.abs(sy-fy);
        int v=Math.abs(sx-fx);
        int min=0;
        if(h==0 && h==v && t==1){
            return false;
        }
        if(h<v){
          min=h;
          v-=h;
          min+=v;
        }else{
            min=v;
            h-=v;
            min+=h;
        }
     if(min<=t){
        return true;
     }  
     return false; 
    }
}