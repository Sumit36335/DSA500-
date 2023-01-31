String[] map ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res= new ArrayList<>();
    public void helper(String input,int idx , String output)
    {
        if(idx==input.length())
        {
            res.add(output);
            return ;
        }
        int digit = input.charAt(idx)-'0';
        for(char ch : map[digit].toCharArray())
        {
            helper(input,idx+1,output+ch);
        }
    }
    public List<String> letterCombinations(String input) {
        if(input.length()==0)return res;
        helper(input,0,"");
        
