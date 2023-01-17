 public String convertToBase7(int N) {
        long res=0,power=1;

        while(N!=0)
        {
            int rem =N%7;
            res=res+power*rem;
            N=N/7;
            power=power*10;
        }
        return String.valueOf(res);
    }
