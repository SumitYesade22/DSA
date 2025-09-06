class node implements Comparable<node>{
    char c;
    int i;
    node(char c , int i){
        this.c=c;
        this.i=i;

    }
    public int compareTo( node that){
        if(this.c==that.c){
            return that.i-this.i;
        }
        return Character.compare(this.c,that.c);
    }
}



class Solution {
    public String clearStars(String s) {
        PriorityQueue<node>pq=new PriorityQueue<>();
       
        char[] str = s.toCharArray();
      for(int i=0;i<str.length;i++){
        if(str[i]!='*'){
            pq.offer(new node(str[i],i));
            continue;
        }
        if(!pq.isEmpty()){
            node np=pq.poll();
            int idx=np.i;
            str[idx]='*';

        }

      }
      StringBuilder res=new StringBuilder();
        int index = 0;
        for (char c : str) {
            if (c != '*') {
               res.append(c);
            }
        }

        return res.toString();

        
    }
}