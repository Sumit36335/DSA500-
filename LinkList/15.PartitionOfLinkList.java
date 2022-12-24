 public ListNode partition(ListNode head, int x) {
        ListNode ldummy= new ListNode(-1);
        ListNode rdummy= new ListNode(-1);
        ListNode ltail=ldummy;
        ListNode rtail=rdummy;

        while(head!=null)
        {
            if(head.val<x)
            {
                ltail.next=head;
                ltail=ltail.next;
                head=head.next;
            }
            else
            {
                rtail.next=head;
                rtail=rtail.next;
                head=head.next;
            }
        }
        ltail.next=rdummy.next;
        rtail.next=null;
        return ldummy.next;
    }
