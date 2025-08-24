class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<spaces.length;i++){
            int index=spaces[i];
            if(spaces[i]==0){
                res.append(" ");
            }else if(spaces[i]==1){  
                  res.append(s.substring(0,spaces[i])).append(" ");
            }else{
                if(i==0){
                res.append(s.substring(0,spaces[i])).append(" ");
                }
                else{
                    res.append(s.substring(spaces[i-1],spaces[i])).append(" ");

                }}
          
        }
        res.append(s.substring(spaces[spaces.length-1]));
    return res.toString();  
    }
}