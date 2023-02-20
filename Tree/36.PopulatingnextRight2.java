public Node connect(Node root) {
        Node curr=root;

        while(curr!=null)
        {
            Node head = new Node(-1);
            Node tail = head;

            for(;curr!=null;curr=curr.next)
            {
                if(curr.left!=null)
                {
                    tail.next=curr.left;
                    tail=tail.next;
                }
                if(curr.right!=null)
                {
                    tail.next=curr.right;
                    tail=tail.next;
                }
            }
            curr=head.next;
        }
        return root;
    }
