 List<List<Integer>> powerSet= new ArrayList<>();

    public void subsets(int[]arr,int idx,List<Integer> subset)
    {
        if(idx==arr.length)
        {
            powerSet.add(new ArrayList<>(subset));
            return;
        }
        // yes
        subset.add(arr[idx]);
        subsets(arr,idx+1,subset);
        subset.remove(subset.size()-1);

        // no
        subsets(arr,idx+1,subset);
    }
    public List<List<Integer>> subsets(int[] nums) {
        subsets(nums,0,new ArrayList<>());   
        return powerSet;
    }
