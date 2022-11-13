 public static long mySqrt(long x) {
        long left=1;
        long right=x;
        while(left<=right)
        {
            long mid=(left)+(right-left)/2;
            if(1l*mid*mid<=x)
            {
                left=mid+1;
            }
            else
            {
                 right=mid-1;
            }
        }
        return right;
     }
    public static double squareRoot(long n, int d) {
        // Write your code here.
            long floor=mySqrt(n);
            double ans=floor;
            double factor=1.0;
            for(int i=0;i<d;i++)
            {
                factor=factor/10;
                for(int j=0;j<10;j++)
                {
                    if((ans+factor)*(ans+factor)<=n)
                {
                    ans+=factor;
                }
                else 
                {
                    break;
                }

                }
            }
        return ans;
    }
