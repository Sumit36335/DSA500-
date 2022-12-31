class MyStack
{
    ArrayList<Integer>arr= new ArrayList<>();
    void push(int value)
	{
	    arr.add(value);
	} 
	int pop()
	{
        if(arr.size()==0)return -1;
        return arr.remove(arr.size()-1);
	}
}
