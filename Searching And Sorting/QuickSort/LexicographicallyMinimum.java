 public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i=0;i<n-1;i=i+2)
        {
            int temp= arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
