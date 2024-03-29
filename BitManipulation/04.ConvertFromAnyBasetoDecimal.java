 static int get(char val)
    {
        if(val>='0' && val<='9')
        {
            return val-'0';
        }
        return val-'A'+10;
    }
    static int decimalEquivalent(String N, int b)
    {
        int res =0,power=1;
        for(int idx=N.length()-1;idx>=0;idx--)
        {
            char ch = N.charAt(idx);
            int val = get(ch);
            
            if(val>=b)return -1; // invalid
            
            res=res+power*val;
            power=power*b;
        }
        return res;
        
    }
