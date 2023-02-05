 List<List<Integer>> subsets = new ArrayList<>();

    public void helper(int[] coins , int idx , int target , List<Integer>subset)
    {
        if(target<0)return;
        if(idx==coins.length)
        {
            if(target==0)subsets.add(new ArrayList<>(subset));
            return ;
        }
        // yes 
        subset.add(coins[idx]);
        helper(coins,idx,target-coins[idx],subset);
        subset.remove(subset.size()-1);

        // no
        helper(coins,idx+1,target,subset);
    }
    public List<List<Integer>> combinationSum(int[] coins, int target) {
        helper(coins,0, target,new ArrayList<>());
        return subsets;   
    }
