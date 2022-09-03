 public boolean isPowerOfTwo(int n) {
        if(n<0)return false;
        if(n==1)return true;
        for(int i=0;i<=30;i++)
        {
            int power=(int) Math.pow(2,i);
            if(power==n)
            {
                return true;
            }
        }
        return false;
    }
