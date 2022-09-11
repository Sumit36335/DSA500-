static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Long max= Long.MIN_VALUE;
        Long min= Long.MAX_VALUE;
        
        for(int i=0;i<a.length;i++)
        {
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        return new pair(min,max);
    }
