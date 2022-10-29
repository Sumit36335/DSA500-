 public static void partition(int[] arr, int pivot){
    //write your code here
    int left=0;
    int right=0;
    while(right<arr.length)
    {
        if(arr[right]<=pivot)
        {
            swap(arr,right, left);
            left++;
            right++;
        }
        else
        {
            right++;    
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
