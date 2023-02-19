public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();

        if(root==null)return levels;

        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            List<Integer>level = new ArrayList<>();

            for(int c=q.size();c>0;c--)
            {
                root=q.remove();
                level.add(root.val);

                if(root.left!=null)q.add(root.left);
                if(root.right!=null)q.add(root.right);
            }
            if(levels.size()%2==1)Collections.reverse(level);
            levels.add(level);
        }
        return levels;
    }
