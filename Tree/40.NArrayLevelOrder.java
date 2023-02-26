public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>>levels= new ArrayList<>();
        if(root==null)return levels;

        Queue<Node>q=new ArrayDeque<>();
        q.add(root);

        while(q.size()>0)
        {
            List<Integer>level=new ArrayList<>();
            for(int c=q.size();c>0;c--)
            {
                root=q.remove();
                level.add(root.val);
                for(Node child :root.children )
                {
                    q.add(child);
                }
            }
            levels.add(level);
        }
        return levels;

    }
