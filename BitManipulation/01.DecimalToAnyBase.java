 static char get(int n)
    {
        if(n<10)return (char)('0'+n);
        if(n==10)return 'A';
        if(n==11)return 'B';
        if(n==12)return 'C';
        if(n==13)return 'D';
        if(n==14)return 'E';
        else return  'F';
    }
    static String getNumber(int B, int N){
        // code here
        StringBuilder str= new StringBuilder();
        while(N!=0)
        {
            char rem= get(N%B);
            str.append(rem);
            N=N/B;
        }
        return str.reverse().toString();
        
    }
