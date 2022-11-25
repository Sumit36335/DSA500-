static int gcd(int A, int B)
    {
        if(A%B==0)return B;
        return gcd(B,A%B);
    }
    public int gcd(int N , int arr[]) 
    { 
        int gcd1=arr[0];
       for(int i=1;i<N;i++)
       {
           gcd1=gcd(arr[i],gcd1);
       }
       return gcd1;
    }
