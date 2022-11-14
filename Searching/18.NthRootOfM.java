 public int NthRoot(int n, int m)
    {
        // code here
        int left=0;
        int right=m;
        while(left<=right)
        {
            int mid =left+(right-left)/2;
            int pow=(int)Math.pow(mid,n);
            if(pow==m)return mid;
            else if(pow<m)left=mid+1;
            else right=mid-1;
        }
        if(Math.pow(right,n)==m)return right;
        else return -1;
        
    }
