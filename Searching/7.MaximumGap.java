  public int[] countSort(int[] nums,int place) {
     int[] freq= new int[10];
     for(int val:nums)
     {
        int digit=(val/place)%10;
        freq[digit]++;
     }
     for(int i =freq.length-2;i>=0;i--)
     {
         freq[i]=freq[i]+freq[i+1];
     }
     int [] res= new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
         int digit = (nums[i]/place)%10;
         int idx = nums.length-freq[digit];
         freq[digit]--;
         res[idx]=nums[i];
     }
    return res;
   }
    public int maximumGap(int[] nums) {
        if(nums.length<=1)return 0;

        for(int place=1;place<=1000000000;place=place*10)
        {
            nums= countSort(nums,place);
        }
        int gap=Integer.MIN_VALUE;
        for(int idx=0;idx<nums.length-1;idx++)
        {
            gap=Math.max(gap,nums[idx+1]-nums[idx]);
        }
        return gap;
    }
