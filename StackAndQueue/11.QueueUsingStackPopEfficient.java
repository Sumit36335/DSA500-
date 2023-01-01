class MyQueue {
    
    Stack<Integer> actual = new Stack<>();
    Stack<Integer> demo = new Stack();
    
    public void push(int x) {
        while(actual.size()>0)
        {
            demo.push(actual.pop());
        }
        actual.push(x);
        while(demo.size()>0)
        {
            actual.push(demo.pop());
        }
    }
    
    public int pop() {
        return actual.pop();
    }
    
    public int peek() {
        return actual.peek();
    }
    
    public boolean empty() {
        return actual.size()==0;
    }
}
