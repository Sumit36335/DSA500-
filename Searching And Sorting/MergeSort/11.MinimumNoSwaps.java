 public static int  merge(int[] arr, int left,int mid ,int right)
    {
        int ptr1=left;
        int ptr2=mid+1;
        int ptr3=0;
        int inv_count=0;
        int[] res = new int[right-left+1];
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
    static int mergeSort(int[] arr, int l,int r)
    {
        if(l==r)return 0;
        int  mid= (l+r)/2;
        int left=mergeSort(arr,l,mid);
        int right= mergeSort(arr,mid+1,r);
        int curr=merge(arr,l,mid,r);
        
        return left+right+curr;
    }
    
    int countSwaps(int arr[], int n) {
        // code here
          return mergeSort(arr,0,arr.length-1);
    }
