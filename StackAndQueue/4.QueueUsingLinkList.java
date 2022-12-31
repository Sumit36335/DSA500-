class MyQueue
{
    QueueNode front, rear;
	void push(int value)
	{
	    QueueNode node = new QueueNode(value);
        if(front==null)
        {
            front=rear=node;
        }
        else
        {
            rear.next=node;
            rear=node;
        }
	}
	
	int pop()
	{
        if(front==null)
        {
            return -1 ; //underflow
        }
        else
        {
            int ans= front.data;
            front=front.next;
            return ans;
        }
	}
}
