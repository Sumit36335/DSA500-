int ans =0;
    public int subTreeSum(TreeNode root)
    {
        if(root==null)return 0;

        int lsum=subTreeSum(root.left);
        int rSum=subTreeSum(root.right);

        int tilt=Math.abs(lsum-rsum);
        ans+=tilt;

        return lsum+rsum+root.val;
    }
    public int findTilt(TreeNode root) {
        subTreeSum(root);
        return ans;
    }
