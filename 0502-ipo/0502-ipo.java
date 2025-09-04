class Project implements Comparable<Project>{
    int cap;
    int profit;
    Project(int cap,int profit){
        this.cap=cap;
        this.profit=profit;
    }
    public int compareTo(Project that){
        return this.cap-that.cap;
    }
}


class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project>minpq=new PriorityQueue<>();
        PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder());
        int n=capital.length;
        for(int i=0;i<n;i++){
            minpq.offer(new Project(capital[i],profits[i])); 
        }
        while(k>0){
            while(!minpq.isEmpty() && minpq.peek().cap<=w){
              
                maxpq.offer(minpq.poll().profit);
            }
            if(maxpq.isEmpty()){
                break;
            }
            w+=maxpq.poll();
            k--;
        }
     return w;
    }
}