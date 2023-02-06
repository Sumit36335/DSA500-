 List<Integer>postOrder= new ArrayList<>();
    public void dfs(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        dfs(root.left);
        dfs(root.right);
        postOrder.add(root.val);    
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return  postOrder;
    }
