 List<List<Integer>> res = new ArrayList<>();
    public void combine(int n,int k,List<Integer>output)
    {

        if(k==0)
        {
            res.add(new ArrayList<>(output));
            return;
        }
        if(n==0)return;


        // yes 
        output.add(n);
        combine(n-1,k-1,output);
        output.remove(output.size()-1);

        //no
        combine(n-1,k,output);
    }

// 2 approach 
    List<List<Integer>> res = new ArrayList<>();
    public void combine(int n,int k,List<Integer>output)
    {

        if(k==0)
        {
            res.add(new ArrayList<>(output));
            return;
        }
        if(n==0)return;

        for(int item=n;item>=1;item--)
        {
            output.add(item);
            combine(item-1,k-1,output);
            output.remove(output.size()-1);
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        combine(n,k,new ArrayList<>());
        return res;
    }
