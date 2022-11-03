    public int partioning(int[]arr,int start,int end)
    {
        int pivot=arr[end];
        int left=start;
        int right=start;
        while(right<=end)
        {
            if(arr[right]<=pivot)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right++;
            }
            else
            {
               right++; 
            }
        }
        return left-1;
    }
    public void quicksort(int[]arr, int start,int end)
    {
        if(start>=end)return;
        int pivot= partioning(arr,start,end);
        quicksort(arr,start,pivot-1);
        quicksort(arr,pivot+1,end);
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
