 List<Integer>ans= new ArrayList<>();
    public void dfs(Node root)
    {
        for(Node child:root.children)dfs(child);
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        if(root!=null)dfs(root);
        return ans;
    }
