 public int[] plusOne(int[] digits) {
        int n= digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i]=0;
            }
        }
        int[] newarray= new int[n+1];
        newarray[0]=1;
        return newarray;
    }
