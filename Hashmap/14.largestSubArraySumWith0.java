int maxLen(int arr[], int n)
    {
        // Your code here
        
        HashMap<Long,Integer>map=new HashMap<>();
        
        map.put(0l,-1);
        int longest=0;
        long sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
            int last=map.getOrDefault(sum,i);
            longest=Math.max(longest,i-last);
            map.putIfAbsent(sum,i);
        }
        return longest;
    }
