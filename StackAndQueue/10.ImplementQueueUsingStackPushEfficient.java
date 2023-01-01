class MyQueue {
    
    Stack<Integer> actual = new Stack<>();
    Stack<Integer> demo = new Stack();
    
    public void push(int x) {
        actual.push(x);
    }
    
    public int pop() {
        while(actual.size()>0)
        {
            demo.push(actual.pop());
        }
        int ans = demo.pop();
        while(demo.size()>0)
        {
            actual.push(demo.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(actual.size()>0)
        {
            demo.push(actual.pop());
        }
        int ans = demo.peek();
        while(demo.size()>0)
        {
            actual.push(demo.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return actual.size()==0;
    }
}
