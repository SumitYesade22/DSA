class StockSpanner {
     Stack <Integer> stack;
     ArrayList <Integer> arr;
    public StockSpanner() {
        stack = new Stack<Integer>();
        arr = new ArrayList<>();
       
        
    }
    
    public int next(int price) {
        arr.add(price);
        while(!stack.isEmpty() && arr.get(stack.peek())<=price ){
            stack.pop();
        }
        int currentIndex = arr.size()-1;
        int prevhigherIndex = stack.isEmpty()?-1:stack.peek();
        int ans = currentIndex-prevhigherIndex;
        stack.push(currentIndex);
        return ans;
     
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */