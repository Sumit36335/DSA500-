  int [] postOrder,inOrder;
    public int search(int val)
    {
        for(int i=0;i<inOrder.length;i++)
        {
            if(inOrder[i]==val)return i;
        }
        System.out.println("g");
        return -1;
    }
    public TreeNode construct(int rootidx, int low, int high)
    {
        if(low>high)return null;
        if(low==high)return new TreeNode(postOrder[rootidx]);
        
        TreeNode root=new TreeNode(postOrder[rootidx]);
        int mid=search(postOrder[rootidx]);
        root.left=construct(rootidx-1-(high-mid),low,mid-1);
        root.right=construct(rootidx-1,mid+1,high);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        this.postOrder=postorder;
        this.inOrder=inorder;
        return construct(inorder.length-1,0,inorder.length-1);
    }
