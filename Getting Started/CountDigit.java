 static int evenlyDivides(int N){
        // code here
        int count=0;
        int num =N;
        while(num>0)
        {
            int rem = num%10;
            if(rem!=0 && N%rem==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }
