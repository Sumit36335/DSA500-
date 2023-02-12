List<String> paths = new ArrayList<>();
    public void dfs(TreeNode root , String path)
    {
        if(root==null)return ;
        if(root.left==null && root.right==null)
        {
            path+=root.val;
            paths.add(path);
            return;
        }
        dfs(root.left,path+root.val+"->");
        dfs(root.right,path+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
       dfs(root,"");
       return paths;   
    }
