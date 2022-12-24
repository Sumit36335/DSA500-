public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(Integer.MIN_VALUE);
        ListNode tail=dummy;
        while(head!=null)
        {
            if(head.next!=null  && head.next.val==head.val)
            {
                int temp=head.val;
                while(head!=null && head.val==temp)
                {
                    head=head.next;
                }
            }
            else
            {
                tail.next=head;
                tail=head;
                head=head.next;
            }
        }
        tail.next=null;
        return dummy.next;
    }
