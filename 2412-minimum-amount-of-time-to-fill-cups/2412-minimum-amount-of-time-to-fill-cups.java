class Solution {
    public int fillCups(int[] amount) {
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:amount){
        if(num==0){
            continue;
        }
        pq.offer(num);
       } 
       int s=0;
    while(pq.size()>1){
     int n=pq.poll();
     int m=pq.poll();
     n--;
     m--;
     s++;
     if(n!=0){
     pq.offer(n);
     }
     if(m!=0){
  pq.offer(m);
     }
    
   

    }
    while(!pq.isEmpty()){
        int k=pq.poll();
        s++;
        k--;
        if(k!=0){
              pq.offer(k);
        }
       
    }
    return s;
    }
}