class Tasks implements Comparable<Tasks>{
    int freq;
    int time;
    Tasks(int freq,int time){
        this.freq=freq;
        this.time=time;
    }
    public int compareTo(Tasks that){
        return that.freq-this.freq;
    }
}


class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>mp=new HashMap<>();
        PriorityQueue <Tasks> maxpq=new PriorityQueue<>();
        for(char ch:tasks){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int val:mp.values()){
            maxpq.offer(new Tasks(val,0));
        }
        Queue<Tasks>tk=new LinkedList<>();
        int ctime=0;
        while(!maxpq.isEmpty() || !tk.isEmpty()){
            ctime++;
            
            if(!maxpq.isEmpty()){
            Tasks m=maxpq.poll();
            m.freq--;
            if(m.freq>0){
               m.time=ctime+n;
               tk.offer(m);
            }
           
            }
            if(!tk.isEmpty() && tk.peek().time==ctime){
                Tasks k=tk.poll();
                maxpq.offer(k);
            }
            
        }
        return ctime;
    }
}