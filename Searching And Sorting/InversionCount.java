public static long merge(long[] arr, int left,int mid ,int right)
    {
        int ptr1=left;
        int ptr2=mid+1;
        int ptr3=0;
        long inv_count=0;
        long[] res = new long[right-left+1];
        while(ptr1<=mid && ptr2<=right)
        {
            if(arr[ptr1]<=arr[ptr2])
            {
                res[ptr3]=arr[ptr1];
                ptr1++;
                ptr3++;
            }
            else
            {
                inv_count+=(mid-ptr1)+1;
                res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;
            }
        }
        while(ptr1<=mid)
        {
                res[ptr3]=arr[ptr1];
                ptr1++;
                ptr3++;
        }
        while(ptr2<=right)
        {
                res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;
        }
        for(int i=left;i<=right;i++)
        {
            arr[i]=res[i-left];
        }
        return inv_count;
    }
    static long mergeSort(long[] arr, int l,int r)
    {
        if(l==r)return 0;
        int  mid= (l+r)/2;
        long left=mergeSort(arr,l,mid);
        long right= mergeSort(arr,mid+1,r);
        long curr=merge(arr,l,mid,r);
        
        return left+right+curr;
    }
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr,0,arr.length-1);
    }
