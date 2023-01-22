
class Solution
{
    List<String>subsets=new ArrayList<>();
    public void powerset(String input,int idx,String output)
    {
        if(idx==input.length())
        {
            if(output.length()>0)subsets.add(output);
            return;
        }
        powerset(input,idx+1,output);
        powerset(input,idx+1,output+input.charAt(idx));
    }
    public List<String> AllPossibleStrings(String s)
    {
        powerset(s,0,"");
        Collections.sort(subsets);
        return subsets;
    }
}
