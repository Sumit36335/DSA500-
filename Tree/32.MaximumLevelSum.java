 public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);

        int maxsum=Integer.MIN_VALUE,maxlevel=0;
        int currsum=0,currlevel=0;
        while(q.size()>0)
        {
            currsum=0;currlevel++;
            
            for(int c=q.size();c>0;c--)
            {
                root=q.remove();
                currsum+=root.val;

                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
            }
            if(currsum>maxsum){
                 maxsum=currsum;
                 maxlevel=currlevel;
            }
        }
        return maxlevel;
    }
