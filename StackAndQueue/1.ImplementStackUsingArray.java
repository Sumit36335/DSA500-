class MyStack
{
	int arr[] = new int[1000];
	int top = 0;
    void push(int value)
	{
	    if(top==arr.length)return ;
	    arr[top]=value;
	    top++;
	} 
	int pop()
	{
        if(top==0)return -1;
        top--;
        return arr[top];
	}
}
