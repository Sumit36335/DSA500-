static int countFactors(int N) {
        //code here
        int count=0;
        for(int i=1;i*i<=N;i++)
        {
            if(N%i==0){
                count++;
                if(i!=N/i)count++;
            }
        }
        return count;
    }
    static int count(int A,int B,int N){  
        // code here
        int count=0;
        for(int i=A;i<=B;i++)
        {
            if(countFactors(i)==N)count++;
           
        }
        return count;
    }
