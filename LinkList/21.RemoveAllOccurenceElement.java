 public ListNode removeElements(ListNode head, int val) {
        ListNode dummy= new ListNode(-1);
        ListNode dummyTail=dummy;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val!=val)
            {
                dummyTail.next=curr;
                dummyTail=dummyTail.next;
            }
            curr=curr.next;
        }
        dummyTail.next=null;
        return dummy.next;
    }
