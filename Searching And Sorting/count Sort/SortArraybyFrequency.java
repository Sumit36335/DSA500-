public int[] frequencySort(int[] nums) {
     int min = -100;
     int max = 100;
     int freq[]= new int[max-min+1];
     for(int val:nums)freq[val-min]++;
     ArrayList<Integer>[]buckets= new ArrayList[nums.length+1];
    for(int i=0;i<buckets.length;i++)
    {
        buckets[i]= new ArrayList<>();
    }
    for(int idx=0;idx<freq.length;idx++)
    {
        int val=idx+min;
        for(int c=0;c<freq[idx];c++)
        {
            buckets[freq[idx]].add(val);
        }
    }
    int k=0;
    for(int i=1;i<buckets.length;i++)
    {
        for(int j=buckets[i].size()-1;j>=0;j--)
        {
                nums[k++]=buckets[i].get(j);
        }
    }
    return nums;
    }
