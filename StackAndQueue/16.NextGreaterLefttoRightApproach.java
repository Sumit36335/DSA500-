public static long[] nextLargerElement(long[] arr, int n)
    { 

        Stack<Integer>stk = new Stack<>();
        long[] nge= new long[n];
        Arrays.fill(nge,-1);
        
        for(int i=0;i<n;i++)
        {
            while(stk.size()>0 && arr[i]>arr[stk.peek()])
            {
                nge[stk.pop()]=arr[i];
            }
            stk.push(i);
        }
        return nge;
        
    }
