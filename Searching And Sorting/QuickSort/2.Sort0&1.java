    public static void swap(int[] arr, int i, int j) 
    {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }

    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        int left =0;
        int right=0;
        while(right<N)
        {
            if(A[right]==0)
            {
                swap(A,left,right);
                left++;
                right++;
            }
            else
            {
                right++;
            }
        }
        
    }
