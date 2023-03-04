 int prev=-1000000000,diff=(int)1e8;
    public void inorder(TreeNode root)
    {
        if(root==null)return ;

        inorder(root.left);
        diff=Math.min(diff,root.val-prev);
        prev=root.val;
        inorder(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return diff;
    }
