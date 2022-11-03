long merge(long arr[], int l, int m, int r)
    {
        int[]res=new int[r-l+1];
        int ptr1=l;
        int ptr2=m+1;
        int ptr3=0;
        long inversionCount=0;
        while(ptr1<=m && ptr2<=r)
        {
            if(arr[ptr1]<=arr[ptr2])
            {
                res[ptr3]=arr[ptr1];
                ptr1++;
                ptr3++;
            }
            else
            {
                inversionCount=(m-ptr1+1);
                res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;
            }
        }
            while(ptr1<=m)
            {
                res[ptr3]=arr[ptr1];
                ptr1++;
                ptr3++;
            }
            while(ptr2<=r)
            {
              res[ptr3]=arr[ptr2];
                ptr2++;
                ptr3++;  
            }
            return inversionCount;
        
        
    }

    long mergeSort(long arr[], int l, int r)
    { 
        if(l==r)return 0 ;
        int mid=(l+r)/2;
       int left= mergeSort(arr,l,mid);
        int right=mergeSort(arr,mid+1,r);
        int curr=merge(arr,l,mid,r);
        return left+right+curr;
    }
long long int inversionCount(long long arr[], long long N)
{
    mergeSort(arr,0,N-1);
}
