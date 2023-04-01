public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
        HashMap<Long,Integer>map= new HashMap<>();
        
        map.put(0l,-1);
        int longest =0;
        long sum=0;
        
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            
            int last=map.getOrDefault(sum-K,i);
            longest=Math.max(longest,i-last);
            map.putIfAbsent(sum,i);
        }
        return longest;
        
        
    }
