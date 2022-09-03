	public static long sumOrProduct(int n, int q) {

		// Write your code her
        if(q==1)
        {
            int ans = (n*(n+1))/2;
            return (long)(ans);
        }
        else if(q==2)
        {
            long prod=1;
            for(long i=1;i<=n;i++)
            {
                prod=(prod*i)%1000000007;
            }
            return prod;
        }
        return 0;
    }
