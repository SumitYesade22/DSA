class ProductOfNumbers {
    List<Integer>list;
    int n=0;

    public ProductOfNumbers() {
    list=new ArrayList<>();
    n=list.size();
        
    }
    
    public void add(int num) {
        if(num==0){
            list.clear();
        }else{
            if(list.size()==0){
                list.add(num);
            }else{
                list.add(list.get(list.size()-1)*num);
            }
        }
        
    }
    
    public int getProduct(int k) {
        if(list.size()<k){
            return 0;
        }else if(list.size()==k){
            return list.get(list.size()-1);
        }else{
            return list.get(list.size()-1)/list.get(list.size()-k-1);
        }
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */