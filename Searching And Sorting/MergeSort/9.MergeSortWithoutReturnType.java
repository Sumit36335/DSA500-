void merge(int arr[], int l, int m, int r)
    {
        int res[] = new int[r-l+1];
        int ptr1=l;
        int ptr2=m+1;
        int ptr3=0;
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
        for(int i=l;i<=r;i++)
        {
            arr[i]=res[i-l];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r)return ;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
