 long diameter = Long.MIN_VALUE;
    public long height (TreeNode root)
    {
        if(root==null)return 0;

        long lsum=Math.max(height(root.left),0);
        long rsum=Math.max(height(root.right),0);

        diameter = Math.max(diameter, lsum+rsum+root.val);
        return Math.max(lsum,rsum)+root.val;

    }
    public int maxPathSum(TreeNode root) {
        height(root);
        return (int)diameter;
    }
