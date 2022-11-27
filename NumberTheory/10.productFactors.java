 int factorProduct(int N) {
        
        long count=1;
        for(int i=1;i*i<=N;i++)
        {
            if(N%i==0){
                count=(count*i)%1000000007;
                if(i!=N/i){
                    count=(count*(N/i))%1000000007;
                }
            }
        }
        return (int)count;
    }
