 int  twoPassAlgo(Node head,int k)
    {
        	
    	Node curr=head;
    	int n=0;
    	while(curr!=null)
    	{
    	    curr=curr.next;
    	    n++;
    	}
    	if(k==0 || k>n)return -1;
    	curr=head;
    	for(int i=0;i<(n-k);i++)
    	{
    	    curr=curr.next;
    	}
    	return curr.data;
    }
    int  onePassAlgo(Node head,int k)
    {
        	
    	Node slow = head;
    	Node fast = head;
    	for(int i=0;i<k;i++)
    	{
    	    if(fast==null)return -1;
    	    fast=fast.next;
    	}
    	while(fast!=null)
    	{
    	    slow=slow.next;
    	    fast=fast.next;
    	}
    	return slow.data;
    }
    int getNthFromLast(Node head, int k)
    {
    	// Your code here
    	return onePassAlgo(head,k);
    
    }
