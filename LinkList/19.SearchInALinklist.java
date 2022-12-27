public static int searchInLinkedList(LinkedListNode<Integer> head, int k) {
        // Write your code here.
        while(head!=null)
        {
            if(head.data==k)return 1 ;
            head=head.next;
        }
        return 0;
    }
