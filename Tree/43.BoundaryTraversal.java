 ArrayList<Integer>res;
    void leftBoundary(Node root)
    {
        if(root==null)return ;
        if(root.left==null && root.right==null)
        {
            return ;
        }
        else
        {
            res.add(root.data);
            if(root.left!=null)leftBoundary(root.left);
            else leftBoundary(root.right);
        }
    }
    void rightBoundary(Node root)
    {
        if(root==null)return ;
        if(root.left==null && root.right==null)
        {
            return ;
        }
        else
        {
            
            if(root.right!=null)rightBoundary(root.right);
            else rightBoundary(root.left);
            res.add(root.data);
        }
    }
    void dfs(Node root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)
        {
            res.add(root.data);
        }
        dfs(root.left);
        dfs(root.right);
    }
	ArrayList <Integer> boundary(Node root)
	{
	    res = new ArrayList<>();
	    res.add(root.data);
	    leftBoundary(root.left);
	    dfs(root.left);
	    dfs(root.right);
	    rightBoundary(root.right);
	    return res;
	}
