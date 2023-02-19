 int xparent=-1 , yparent=-1, xlevel=-1,ylevel=-1;

        public void dfs(TreeNode root, int level , int parent , int x , int y)
        {
            if(root==null)return ;

            if(root.val==x)
            {
                xparent = parent ; 
                xlevel = level;
            }

            if(root.val==y)
            {
                yparent = parent;
                ylevel=level;
            }
            dfs(root.left,level+1, root.val,x,y);
            dfs(root.right,level+1, root.val,x,y);
        }
    public boolean isCousins(TreeNode root, int x, int y) {
        
          dfs(root,0,-1,x,y);
          return (xparent!=yparent)&&(xlevel==ylevel) ;      
    }
