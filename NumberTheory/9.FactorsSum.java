
    public long factorSum(int N) 
    { 
       //code here.
       
         //code here
        long count=0;
        for(int i=1;i*i<=N;i++)
        {
            if(N%i==0){
                count+=i;
                if(i!=N/i)count+=N/i;
            }
        }
        return count;   
    } 
