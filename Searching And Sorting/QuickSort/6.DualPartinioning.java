 public static void swap(int[] arr, int i, int j) 
    {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here
        int left=0;
        int mid=0;
        int right= arr.length-1;
        
        while(mid<=right)
        {
            if(arr[mid]<a)
            {
                swap(arr,left,mid);
                left++;
                mid++;
            }
            else if(arr[mid]>=a && arr[mid]<=b)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,right);
                right--;
            }
        }
    }
