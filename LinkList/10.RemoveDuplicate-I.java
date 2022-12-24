 public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode tail=dummy;
        while(head!=null)
        {
            if(head.val!=tail.val)
            {
                tail.next=head;
                tail=head;
            }
            head=head.next;
        }
        tail.next=null;
        return dummy.next;
    }
