 public static boolean isPossible(int [] pages,long maxLoad,int totalStud)
    {
        int reqStud=1,currentLoad=0;
        for(int book:pages)
        {
            if(currentLoad+book<=maxLoad)currentLoad+=book;
            else{
              reqStud++;
              currentLoad=book;
            } 
        }
        return (reqStud<=totalStud);
    }
     public static int  maxinArray(int [] pages)
    {
        int max=0;
        for(int book :pages)
        {
            max=Math.max(max,book);
        }
        return max;
    }
    public static int SumofArray(int [] pages)
    {
        int sum=0;
        for(int book:pages)
        {
            sum+=book;
        }
        return sum;
    }
    public int paint(int stud, int time, int[] A) {
        long left=maxinArray(A);
        long right=SumofArray(A);
        
        while(left<=right)
        {
            long mid= left+(right-left)/2l;
            if(isPossible(A,mid,stud)==true)
            {
                right=mid-1;
            }
            else
            {
                left= mid+1;
            }
        }
        return (int)((left*time)%10000003);


    }
