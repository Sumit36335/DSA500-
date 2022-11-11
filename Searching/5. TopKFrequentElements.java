 public int[] topKFrequent(int[] nums, int k) {
        int min=-100000;
        int max=100000;
        int[] freq= new int[max-min+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]-min]++;
        }
        ArrayList<Integer>[]buckets= new ArrayList[nums.length+1];
        for(int i=0;i<buckets.length;i++)
        {
            buckets[i]=new ArrayList<>();
        }
        for(int i=0;i<freq.length;i++)
        {
            int val= i+min;
            buckets[freq[i]].add(val);
        }
        int[]res= new int[k];
        int idx=0;
        for(int j=buckets.length-1;j>0;j--)
        {
                for(int c=0; c<buckets[j].size();c++)
                {
                    res[idx++]=buckets[j].get(c);
                    if(idx==k)return res;
                }
        }
        return res;
    }
