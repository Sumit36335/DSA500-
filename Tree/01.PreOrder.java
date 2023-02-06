 List<Integer>preOrder= new ArrayList<>();
    public void dfs(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        preOrder.add(root.val);
        dfs(root.left);
        dfs(root.right);    
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return preOrder;
    }
