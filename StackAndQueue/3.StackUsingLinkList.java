class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode head = null;
    void push(int value) 
    {
        // Add your code here
        StackNode node  = new StackNode(value);
        node.next=head;
        head= node;
    }
    int pop() 
    {
        // Add your code here
        if(head==null)return -1;
        int ans= head.data;
        head=head.next;
        return ans;
    }
}
