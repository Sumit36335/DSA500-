public int findDuplicate(int[] nums) {
        int n= nums.length;

        for(int i=0;i<nums.length;i++)
        {
            int val = (nums[i]%(n+1));
            nums[val]+=(n+1);
        }
        List<Integer>missing= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int freq=nums[i]/(n+1);
            if(freq>1)return i;
        }
        return -1;
    }
