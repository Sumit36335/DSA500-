 public String frequencySort(String s) {
        int[] freq= new int[128];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        StringBuilder[]buckets= new StringBuilder[s.length()+1];
        for(int i=0;i<buckets.length;i++)
        {
           buckets[i]=new StringBuilder();     
        }
        for(int idx=0;idx<128;idx++)
        {
            char ch= (char)idx;
            for(int c=0;c<freq[idx];c++)
            {
                buckets[freq[idx]].append(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=buckets.length-1;i>=0;i--)
        {
            res.append(buckets[i]);
        }
        return res.toString();
    }
