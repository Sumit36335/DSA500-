static void approach1(long[]arr)
    {
        long[]res= new long[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=arr[(int)arr[i]];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=res[i];
        }
        
    }
    static void approach2(long[]arr)
    {
         int n= arr.length;
        for(int i=0;i<arr.length;i++)
        {
            long old=arr[i]%n;
            long newV= arr[(int)arr[i]]%n;
            arr[i]=old+(newV%n)*n;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]/n;
        }
        
    }
    static void arrange(long arr[], int n)
    {
        approach2(arr);
    }
