 public int[] nextGreaterElements(int[] arr) {
    Stack<Integer>stk= new Stack<>();
    int nge[]= new int[arr.length];
    Arrays.fill(nge,-1);
    for(int i=0;i<arr.length;i++)
    {
        while(stk.size()>0 && arr[i]>arr[stk.peek()])
        {
           nge[stk.pop()]=arr[i];
        }
        stk.push(i);
    }
    for(int i=0;i<arr.length;i++)
    {
         while(stk.size()>0 && arr[i]>arr[stk.peek()])
        {
           nge[stk.pop()]=arr[i];
        }
        stk.push(i);

    }
    return nge;
    }
