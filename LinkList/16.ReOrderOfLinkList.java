 public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev =null;
        while(curr!=null)
        {
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }
    public void reorderList(ListNode head) {

        if(head==null || head.next ==null)return ;
  
        ListNode mid= middle(head);
        ListNode left=head;
        ListNode right= reverse(mid);

        ListNode dummy = new ListNode(-1);
        ListNode dtail=dummy;
        while(left!=null || right!=null)
        {
            if(left!=null)
            {
                dtail.next=left;
                dtail=dtail.next;
                left=left.next;
            }
            if(right!=null)
            {
                dtail.next=right;
                dtail=dtail.next;
                right=right.next;
            }
        }       
        head=dummy.next;
    }
