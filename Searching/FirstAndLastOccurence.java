int firstOccurence(int[]nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left)+(right-left)/2;
            if(nums[mid]>=target)right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    int lastOccurence(int[]nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
             int mid=(left)+(right-left)/2;
            if(nums[mid]>target)right=mid-1;
            else left=mid+1;
        }
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
        int[]arr= new int[2];
        arr[0]=firstOccurence(nums,target);
        arr[1]=lastOccurence(nums,target);
        if(arr[0]>arr[1])return new int[]{-1,-1};
        return arr;
    }
