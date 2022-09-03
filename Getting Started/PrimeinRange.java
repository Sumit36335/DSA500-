 public static int isPrime(int N){
        // code here
        if(N==1)return 0;
        for(int i=2;i*i<=N;i++)
        {
            if(N%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer>arr= new ArrayList<>();
        for(int i=M;i<=N;i++)
        {
            if(isPrime(i)==1)
            {
                arr.add(i);
            }
        }
        return arr;
        
    }
