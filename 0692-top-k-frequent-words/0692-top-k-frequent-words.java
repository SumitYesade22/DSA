class node implements Comparable<node>{
    String str;
    int f;
    node(String str,int f){
        this.str=str;
        this.f=f;
    }
    public int compareTo(node that){
        if(that.f==this.f){
            return this.str.compareTo(that.str);
        }
        return that.f-this.f;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hash=new HashMap<>();
        for(String w:words){
            hash.put(w,hash.getOrDefault(w,0)+1);
        }
        PriorityQueue<node>pq=new PriorityQueue<>();
        for(Map.Entry<String,Integer>entry:hash.entrySet()){
              pq.offer(new node(entry.getKey(),entry.getValue()));
        }
        List<String>ans=new ArrayList<>();
        while(!pq.isEmpty() && k>0){
            node n=pq.poll();
            ans.add(n.str);
            k--;
        }

       
      

      return ans;
        
    }
}