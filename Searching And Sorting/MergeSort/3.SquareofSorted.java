public static int middle(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)return i;
        }
        return nums.length;
    }
    public int[] sortedSquares(int[] nums) {
        int right = middle(nums);
        int left  =  right-1;
        int ptr3=0;
        int[] res= new int[nums.length];
        while(left>=0 && right< nums.length)
        {
            if(nums[left]*nums[left]<= nums[right]*nums[right])
            {
                res[ptr3]=nums[left]*nums[left];
                ptr3++;
                left--;
            }
            else
            {
                res[ptr3]=nums[right]*nums[right];
                ptr3++;
                right++;
            }
        }
        while(left>=0)
        {
                res[ptr3]=nums[left]*nums[left];
                ptr3++;
                left--;
        }
        while(right<nums.length)
        {
                res[ptr3]=nums[right]*nums[right];
                ptr3++;
                right++;
        }
        return res;
    }
