class Solution {
    // extra space
    public static int[] approach1(int [] nums)
    {
        int left=0;
        int right=1;
        int [] res= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
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
    // no extra space
    
    public static int[] approach2(int [] nums)
    {
        int even=0;
        int odd=1;
        while(odd<nums.length && even<nums.length)
        {
            while(even<nums.length && nums[even]%2==0) even+=2;
            while(odd<nums.length && nums[odd]%2!=0)  odd+=2;
            
            if(even<nums.length && odd<nums.length)
            {
                int temp=nums[even];
                nums[even]=nums[odd];
                nums[odd]=temp;
            }
            
        }
        return nums;

    }
    public int[] sortArrayByParityII(int[] nums) {
        // approach1(nums);
        return approach2(nums);
    }
}
