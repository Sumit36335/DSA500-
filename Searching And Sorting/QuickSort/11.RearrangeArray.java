public static void Approach1(long arr[],int n)
    {
        long[]res=new long[arr.length];
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                res[i]=arr[right];
                right--;
            }
            else
            {
                res[i]=arr[left];
                left++;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
    public static void Approach2(long []arr,int n)
    {
        long max=10000001;
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++)
        {
            long oldval=arr[i];
            long newval=0;
            if(i%2==0)
            {
                newval=arr[right]%max;
                right--;
            }
            else
            {
                newval=arr[left]%max;
                left++;
            }
            arr[i]=oldval+(newval%max)*max;
        }
        //decryption
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]/max;
        }
    }
    public static void rearrange(long arr[], int n)
    { 
        // Approach1(arr,n);
        // Approach2(arr,n);
        
    }
