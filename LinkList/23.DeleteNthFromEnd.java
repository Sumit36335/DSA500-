  public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            head=null;
            return head;
        }
        ListNode slow = head;
    	ListNode fast = head;
    	for(int i=0;i<n;i++)
    	{
    	    fast=fast.next;
    	}
        ListNode prev=head;
    	while(fast!=null)
    	{
            prev=slow;
    	    slow=slow.next;
    	    fast=fast.next;
    	}
        if(slow==head){
            head=head.next;
            return head;
        }
        else{
            prev.next=prev.next.next;
            return head;
        }
    }
