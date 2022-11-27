 public int kthFactor(int n, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> right= new ArrayList<>();

        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0){
                res.add(i);
                if(i!=n/i)right.add(n/i);
            }
        }
        Collections.reverse(right);
        res.addAll(right);

        if(k>res.size())return -1;
        return res.get(k-1);
    }
