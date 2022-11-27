public boolean  PerfectSquare(int n)
    {
         int ans=(int)Math.sqrt(n);
         return (ans*ans == n);
    }
    public boolean checkPrime(int n)
    {
        if(n==0 ||n==1 )return false;
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
    public boolean isThree(int n) {
       if(PerfectSquare(n)==false)return false;

       // agar perfect square he to ab check kro ki unke  perfect square prime he ki nhi prime 
       // honge to 3 hoga divisor
       int sqrt=(int)Math.sqrt(n);
       return checkPrime(sqrt); 
    }
