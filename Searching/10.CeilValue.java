public static int ceilingInSortedArray(int n, int target, int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=(left)+(right-left)/2;
            if(nums[mid]==target)return nums[mid];
            else if(nums[mid]>target)right=mid-1;
            else left=mid+1;
        }
        return nums[left];
    }
