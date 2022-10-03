 String reverseWords(String S)
    {
        // code here 
        
        Stack<String> stk= new Stack<String>();
        String check="";
        for(int i=0;i<S.length();i++)
        {
            char ch= S.charAt(i);
            if(ch=='.')
            {
                stk.push(check);
                check="";
            }
            else
            {
                check+=ch;
            }
        }
        stk.push(check);
        String ans="";
        while(stk.size()!=1)
        {
            ans+=stk.peek()+".";
            stk.pop();
        }
        ans+=stk.peek();
        return ans;
        
    }
