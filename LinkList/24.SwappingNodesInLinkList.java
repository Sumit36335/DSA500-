 public ListNode rightFind(ListNode head,int k)
    {
        	
    	ListNode slow = head;
    	ListNode fast = head;
    	for(int i=0;i<k;i++)
    	{
    	    fast=fast.next;
    	}
    	while(fast!=null)
    	{
    	    slow=slow.next;
    	    fast=fast.next;
    	}
    	return slow;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left= head;
        for(int i=1;i<k;i++)
        {
            left=left.next;
        }
        ListNode right = rightFind(head,k);
        int temp=left.val;
        left.val=right.val;
        right.val=temp;

        return head;
    }
