public static void swap(int i , int j ,int[] arr)
    { 
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                }
            }
        }
    }
