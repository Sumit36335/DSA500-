 public ListNode reverse(ListNode  head)
    {
        ListNode curr=head,prev=null;
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
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode first) 
    {
        ListNode mid=middle(first);
        ListNode second=reverse(mid);

        while(first!=null && second!=null)
        {
            if(first.val!=second.val)return false;
            else 
            {
                first=first.next;
                second=second.next;
            }
        }
        return true;
       
    }
