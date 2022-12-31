class MyCircularDeque {

    int [] arr;
    int front=0,rear=0,size=0;
    public MyCircularDeque(int k) {
      arr= new int[k];   
    }
    public boolean insertFront(int value) {
        if(isFull())return false;
        front=(front-1+arr.length)%arr.length;
        arr[front]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull())return false;
        arr[rear]=value;
        rear=(rear+1)%arr.length;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())return false;
        front=(front+1)%arr.length;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty())return false;
        rear=(rear-1+arr.length)%arr.length;
        size--;
        return true;
        
    }
    
    public int getFront() {
         if(isEmpty())return -1;
        return arr[front];
    }
    
    public int getRear() {
         if(isEmpty())return -1;
        return arr[(rear-1+arr.length)%arr.length];
    }
    
    public boolean isEmpty() {
        return (size==0);
    }
    
    public boolean isFull() {
        return (size==arr.length);
    }
}
