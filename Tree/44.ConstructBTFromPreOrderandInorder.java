 int [] preOrder,inOrder;
    public int search(int val)
    {
        for(int i=0;i<inOrder.length;i++)
        {
            if(inOrder[i]==val)return i;
        }
        return -1;
    }
    public TreeNode construct(int rootidx, int low, int high)
    {
        if(low>high)return null;
        if(low==high)return new TreeNode(preOrder[rootidx]);

        TreeNode root=new TreeNode(preOrder[rootidx]);
        int mid=search(preOrder[rootidx]);
        root.left=construct(rootidx+1,low,mid-1);
        root.right=construct(rootidx+1+(mid-low),mid+1,high);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder=preorder;
        this.inOrder=inorder;
        return construct(0,0,inorder.length-1);
    }
