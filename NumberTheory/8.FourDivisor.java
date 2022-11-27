    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int val:nums)
        {
            int countSum=0;
            int count=0;
            for(int i=1;i*i<=val;i++)
            {
                if(val%i==0){
                    countSum+=i;
                    count++;
                    if(i!=val/i)
                    {
                        countSum+=val/i;
                        count++;
                    }
                }
            }
            if(count==4)sum+=countSum;
        }
        return sum;
    }
