 public int findMin(int[] nums) {
        int n= nums.length;
        if(n==1 || nums[0]<nums[n-1])return nums[0];

        int left=0;
        int right=n-1;

        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(mid>0 && nums[mid]<nums[mid-1])return nums[mid];
            else if(nums[mid]<=nums[right])right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
