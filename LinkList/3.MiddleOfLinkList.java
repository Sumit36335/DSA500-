 public ListNode twoPassAlgo(ListNode head)
    {
        ListNode curr=head;
        int n=0;
        while(curr!=null)
        {
            n++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<n/2;i++)
        {
            curr=curr.next;
        }
        return curr;

    }
    public ListNode two(ListNode head)
    {
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode middleNode(ListNode head) {
       return  two(head);
    }
