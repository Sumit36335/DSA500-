 void display(Node head)
    {
        //add code here.
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
