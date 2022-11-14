 public int approach1(int n )
    {
        int k=0;
        while(n>0)
        {
            k++;
            n-=k;
        }
        return n==0 ? k : k-1; 
    }
    public int approach2(int n)
    {
        long left=0,right=n;
        long k;
        while(left<=right)
        {
            long mid=(left)+(right-left)/2;
            k=(mid*(mid+1))/2;
            if(n>=k)left= mid+1;
            else   right=mid-1; 
        }
        return (int)left-1;
    }
    public int arrangeCoins(int n) {
     return approach2(n);   
    }
