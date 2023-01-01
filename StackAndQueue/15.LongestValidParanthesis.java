class Solution {
    public int longestValidParentheses(String s) {
        int[]res=new int[s.length()];
        Stack<Integer>stk = new Stack<>();
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stk.push(i);
            }
            else
            {
                if(stk.size()!=0)
                {
                    int open=stk.pop();
                    res[i]+=(i-open+1);
                    if(open>0)
                    {
                        res[i]+=res[open-1];
                    }
                    max=Math.max(max,res[i]);
                }
                
            }
        }
        return max;
    }
}
