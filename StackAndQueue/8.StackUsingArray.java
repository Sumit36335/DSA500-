class MyStack {
    
    Queue<Integer>q= new ArrayDeque<>();
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
        int ans = q.remove();
        q.add(ans);
        return ans;
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}
