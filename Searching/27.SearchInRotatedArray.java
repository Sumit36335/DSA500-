 public int search(int[]arr,int low ,int high, int target) {
        
        while(low<=high)
        {
            int mid= (low)+(high-low)/2;
            if(arr[mid]>target)
            {
                high= mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else if(arr[mid]== target)
            {
                return mid;
            }
        }
        return -1;
    }
    int findKRotation(int nums[], int n) {
    
        if(n==1 || nums[0]<nums[n-1])return 0;

        int left=0;
        int right=n-1;

        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(mid>0 && nums[mid]<nums[mid-1])return mid;
            else if(nums[mid]<=nums[right])right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int min = findKRotation(nums, nums.length);
        int lans= search(nums,0,min-1,target);
        if(lans !=-1)return lans;
        return search(nums,min,nums.length-1,target); 

    }
