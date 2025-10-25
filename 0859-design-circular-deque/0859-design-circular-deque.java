class MyCircularDeque {
    int size;
    int deq[];
    int csize;
    int f;
    int r;
    int k;

    public MyCircularDeque(int m) {
        deq=new int[m];
        f=0;
        r=m-1;
        k=m;
        csize=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        f=(f-1+k)%k;
        csize++;
        deq[f]=value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        r=(r+1+k)%k;
        csize++;
        deq[r]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        f=(f+1+k)%k;
        csize--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        r=(r-1+k)%k;
        csize--;
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deq[f];
    }
    
    public int getRear() {
          if (isEmpty()) {
            return -1;
        }
        return deq[r];
    }
    
    public boolean isEmpty() {
        return csize==0;
    }
    
    public boolean isFull() {
        return csize==k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */