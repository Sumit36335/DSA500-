public static ArrayList<Integer> duplicates(int[] nums, int n) {
        // code here
        

        for(int i=0;i<nums.length;i++)
        {
            int val = (nums[i]%(n+1));
            nums[val]+=(n+1);
        }
        ArrayList<Integer>repeat= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int freq=nums[i]/(n+1);
            if(freq>1)repeat.add(i);
        }
        if(repeat.size()==0)repeat.add(-1);
        return repeat;
    }
