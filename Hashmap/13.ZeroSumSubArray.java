 public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        
        HashMap<Long,Long>map=new HashMap<>();
        map.put(0l,1l);
        
        long sum=0l;
        long count=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            long freq=map.getOrDefault(sum,0l);
            count+=freq;
            map.put(sum,freq+1l);
        }
        return count;
        

    }
