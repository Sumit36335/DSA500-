 public static void swap(int[]arr,int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void zigZag(int arr[], int n) {
        for(int i=0;i<n;i=i+2)
        {
            if(i-1>=0 && arr[i-1]<=arr[i])
            {
                swap(arr,i,i-1);
            }
            if(i+1<n && arr[i+1]<=arr[i])
            {
                swap(arr,i,i+1);
            }
        }
    }
