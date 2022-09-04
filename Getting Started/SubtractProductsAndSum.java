  public int subtractProductAndSum(int n) {
        int num1=n;
        int sum=0;
        int prod=1;
        while(num1>0)
        {
            int rem = num1%10;
            sum+=rem;
            prod*=rem;
            num1=num1/10;
        }
       
        return prod-sum;
    }
