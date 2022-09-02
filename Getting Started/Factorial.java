static long factorial(int N){
        if(N==0) return 1;
        long a=1;
        for(long i=1;i<=N;i++)
        {
            a=a*i;
        }
        return a;
    }
