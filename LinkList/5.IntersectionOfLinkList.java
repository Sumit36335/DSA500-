  public int size(ListNode curr)
    {
        int size=0;
          while(curr!=null)
          {
              curr=curr.next;
              size++;
          }
          return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB= size(headB);
         
         ListNode currA=headA,currB=headB;
         for(int i=0;i<(sizeA-sizeB);i++)
         {
                currA=currA.next;
         }
         for(int i=0;i<(sizeB-sizeA);i++)
         {
                currB=currB.next;
         }
         while(currA!=currB)
         {
             currA=currA.next;
             currB=currB.next;
         }
         return currA;
    }
