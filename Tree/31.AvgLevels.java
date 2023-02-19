 public List<Double> averageOfLevels(TreeNode root) {
        List<Double>levels= new ArrayList<>();

        if(root== null)return levels;

        Queue<TreeNode>q= new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {   
            double sum=0,count=q.size();
            for(int c= q.size();c>0;c--)
            {
                root=q.remove();
                sum+=root.val;
                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
            }
            levels.add(sum/count);
        }
        return levels;
    }