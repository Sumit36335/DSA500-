public int[] rearrangeArray(int[] nums) {
        int left=0;
        int right=1;
        int[]res= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                res[left]=nums[i];
                left+=2;
            }
            else
            {
                res[right]=nums[i];
                right+=2;
            }
        }
        return res;
    }
