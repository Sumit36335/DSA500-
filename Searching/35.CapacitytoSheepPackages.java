 public static boolean isPossible(int [] pages,int maxLoad,int totalStud)
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
    public int shipWithinDays(int[] A, int stud) {
         int left=maxinArray(A);
        int right=SumofArray(A);
        
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(isPossible(A,mid,stud)==true)
            {
                right=mid-1;
            }
            else
            {
                left= mid+1;
            }
        }
        return left;

    }
