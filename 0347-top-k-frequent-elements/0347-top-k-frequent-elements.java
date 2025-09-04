class Number implements Comparable<Number>{
    int num;
    int freq;
    Number(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
    public int compareTo(Number that){
       return that.freq-this.freq;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number>pq=new PriorityQueue<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            Number number=new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
        }
        int ans[]=new int[k];
        int index=0;
        while(index<k){
           ans[index]=pq.poll().num;
           index++;

        }
     return ans;
        
    }
}