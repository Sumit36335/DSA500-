List<Integer>ans= new ArrayList<>();
    public void dfs(Node root)
    {
        ans.add(root.val);
        for(Node child:root.children)dfs(child);
    }
    public List<Integer> preorder(Node root) {
        if(root!=null)dfs(root);
        return ans;
    }
