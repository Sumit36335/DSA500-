 List<String> res= new ArrayList<>();
    public void solve(String output, int open , int close , int n )
    {
        if(output.length() == 2*n)
        {
            res.add(output);
            return ;
        }

        if(open < n )
        {
            solve(output+"(",open+1, close , n);
        }
        if(close< open )
        {
            solve (output+")",open,close+1,n );
        }

    }
    public List<String> generateParenthesis(int n) {
        solve("",0,0,n);
        return res;
    }
