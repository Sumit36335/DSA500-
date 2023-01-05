  public static long[] nextLargerElement(long[] arr, int n)
    { 

        Stack<Integer>stk = new Stack<>();
        long[] res= new long[n];
    
        
        for(int i=n-1;i>=0;i--)
        {
            while(stk.size()>0 && arr[i]>=arr[stk.peek()])
            {
                stk.pop();
            }
            res[i]=(stk.size()>0)?arr[stk.peek()]:-1;
            stk.push(i);
        }
        return res;
        
    }
