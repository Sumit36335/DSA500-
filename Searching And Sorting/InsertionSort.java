public static void swap(int i , int j ,int[] arr)
    { 
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
  //Function to sort the array using insertion sort algorithm.
  public  void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++)
      {
          for(int j=i;j>0;j--)
          {
              if(arr[j]<arr[j-1])
              {
                  swap(j,j-1,arr);
              }
              else
              {
                  break;
              }
          }
      }
  }
