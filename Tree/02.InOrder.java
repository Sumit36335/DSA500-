  List<Integer>inOrder= new ArrayList<>();
    public void dfs(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        dfs(root.left);
        inOrder.add(root.val);
        dfs(root.right);    
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return inOrder;
    }
