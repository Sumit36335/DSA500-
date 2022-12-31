// 1. approach


class MinStack {

    Stack<Integer>min,stk;
    public MinStack() {
        min = new Stack<>();
        stk = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stk.push(val);
        int newMin=Math.min(min.peek(),val);
        min.push(newMin);
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return  stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}


// 2. approach


class MinStack {

    Stack<Long>stk= new Stack<>();
    long min=Integer.MAX_VALUE;

    public void push(int val) {
        if(val>=min){
            stk.push(1l*val);
        }
        else
        {
            stk.push(2l*val - min);
            min=val;
        }
    }
    
    public void pop() { 
        long top=stk.pop();
        if(top>=min)return;
        min=2l*min-top;
    }
    
    public int top() {
        long top=stk.peek();
        if(top<min)return (int)min;
        return (int)top;
    }
    
    public int getMin() {
        return (int)min;
    }
}
