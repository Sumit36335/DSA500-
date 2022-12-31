class MyQueue {

    int front, rear,size=0;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(size==arr.length) return; //overflow
	    else
	    {
	        arr[rear]=x;
	        rear++;
	        size++;
	    }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(size==0)return -1 ; // under flow
		else
		{
		    int ans=arr[front];
		    front++;
		    size--;
		    return ans;
		}
	} 
}
