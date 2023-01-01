public String removeOuterParentheses(String s) {
        boolean[] outer= new boolean[s.length()];
        Stack<Integer>stk= new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               stk.push(i);
            }
            else
            {
                int open=stk.pop();
                if(stk.size()==0)
                {
                    outer[i]=outer[open]=true;
                }
            } 
        }
        StringBuilder str= new StringBuilder();
        for(int i=0;i<outer.length;i++)
        {
            if(outer[i]==false)str.append(s.charAt(i));
        }
        return str.toString();
    }
