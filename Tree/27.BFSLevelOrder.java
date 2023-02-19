static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        
        ArrayList<Integer>bfs= new ArrayList<>();
        if(root ==null) return bfs;
        
        Queue<Node>q= new ArrayDeque<>();
        q.add(root);
        
        while(q.size()>0)
        {
            root=q.remove();
            bfs.add(root.data);
            
            if(root.left!=null)q.add(root.left);
            if(root.right!=null)q.add(root.right);
        }
        return bfs;
    }
