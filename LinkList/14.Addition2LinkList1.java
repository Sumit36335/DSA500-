 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail=dummy;
        int carry=0;
        while(l1!=null || l2!= null || carry>0)
        {
            int d1= (l1 != null) ? l1.val:0;
            int d2= (l2 != null) ? l2.val:0;

            tail.next = new ListNode( (d1+d2+carry)%10);
            carry= (d1+d2+carry)/10;

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;

            tail=tail.next;
        }
        return dummy.next;
    }
