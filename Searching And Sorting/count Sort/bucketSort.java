public int[] sortArray(int[] nums) {
     int max=50000, min=-50000;
    ArrayList<Integer>[]buckets= new ArrayList[max-min+1];
    for(int i=0;i<buckets.length;i++)
    {
          buckets[i]=new ArrayList<>();
    }
    for(int val:nums) buckets[val-min].add(val);

    int[]res= new int[nums.length];
    int idx=0;
    for(int actual=0;actual<buckets.length;actual++)
    {
            for(int val:buckets[actual]){
                res[idx++]=val;
            }
    }
    return res;
