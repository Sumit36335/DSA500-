 public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head=null;
            return head;
        }
        ListNode slow = head;
        ListNode fast= head;
        ListNode prev = head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow; 
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev.next.next==null) prev.next=null;
        else 
        {
            prev.next=prev.next.next;
        }
        return head;
    }
