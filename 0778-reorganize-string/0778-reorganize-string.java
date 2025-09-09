class node implements Comparable<node>{
    char c;
    int f;
    node(char c,int f){
        this.c=c;
        this.f=f;
    }
    public int compareTo(node that){
        if(this.f==that.f){
            return Character.compare(this.c,that.c);
        }
        return that.f-this.f;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        PriorityQueue<node>pq=new PriorityQueue<>();
        char arr[]=s.toCharArray();
        for(char c:arr){
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)>(arr.length+1)/2){
                return "";
            }
        }
        for(Map.Entry<Character,Integer>map:mp.entrySet()){
            pq.offer(new node(map.getKey(),map.getValue()));
        }

        if(pq.size()==1){
            char ch=pq.poll().c;
            return Character.toString(ch);
        }
        StringBuilder ans=new StringBuilder();
        while(pq.size()>1){
           node a=pq.poll();
           node b=pq.poll();
           ans.append(a.c);
           ans.append(b.c);
           if(a.f-1!=0){
             pq.offer(new node(a.c,a.f-1));
           }
           if(b.f-1!=0){
            pq.offer(new node(b.c,b.f-1));
           }
        }
        if (!pq.isEmpty()) {
            ans.append(pq.poll().c);
        }
       return ans.toString(); 
    }
}