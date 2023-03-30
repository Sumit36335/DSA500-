 HashMap<Long,Integer>map=new HashMap<>();
        map.put(0l,1);
        
        long sum=0l;
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            int freq=map.getOrDefault(sum,0);
            count+=freq;
            map.put(sum,freq+1);
        }
        if(count>=1)return true;
        else return false;
        
