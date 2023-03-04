 public boolean isValidBST(TreeNode root, long low, long high)
    {
        if(root==null)return true;
        if(root.val<=low ||root.val>=high)return false;


        boolean isLeftBST=isValidBST(root.left,low,root.val);
        boolean isRightBST=isValidBST(root.right,root.val,high);
        return isLeftBST &&  isRightBST;
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,(long)-1e15,(long)1e15);
    }
