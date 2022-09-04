static String armstrongNumber(int n){
        // code here
        int num=0;
        int temp=n;
        while(temp>0)
        {
            int rem = temp%10;
            int on= (int)Math.pow(rem,3);
            num+=on;
            temp/=10;
        }
        if(num==n)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
