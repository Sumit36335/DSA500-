 public static void swap(int i , int j ,int[] arr)
    { 
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++)
	    {
	        int minidx=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[minidx])
	            {
	                minidx=j;
	            }
	        }
	        swap(i,minidx,arr);
	        
	    }
	}
