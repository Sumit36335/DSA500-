 
// uses extra space
public int[] pivotArray(int[] nums, int pivot) {
        int[] res= new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                res[left]=nums[i];
                left++;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>pivot)
            {
                res[right]=nums[i];
                right--;
            }
        }
        for(int i=left;i<=right;i++)
        {
            res[i]=pivot;
        }
        return res;
    }
