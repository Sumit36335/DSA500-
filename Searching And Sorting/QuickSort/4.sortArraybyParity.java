public static void swap(int[] arr, int i, int j) 
    {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int right=0;
        int left=0;
        while(right<nums.length)
        {
            if(nums[right]%2==0)
            {
                swap(nums,left,right);
                left++;
                right++;
            }
            else
            {
                right++;
            }
        }
        return nums;
    }
