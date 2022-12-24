 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }
            else
            {
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
        }
        if(list1!=null)tail.next=list1;
        else tail.next=list2;
        return dummy.next;
    }
    public ListNode helper(ListNode[] arr, int left,int right)
    {
        if(left==right)return arr[left];
        
        int mid=(left+right)/2;
        ListNode l1= helper(arr,left,mid);
        ListNode l2= helper(arr, mid+1,right);
        return mergeTwoLists(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        return helper(lists,0,lists.length-1);
    }
