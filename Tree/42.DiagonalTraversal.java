public ArrayList<Integer> diagonal(Node root)
      {
           ArrayList<Integer>res= new ArrayList<>();
           Queue<Node> q= new ArrayDeque<>();
           
           while(root!=null || q.size()>0)
           {
               if(root==null)root=q.remove();
               else 
               {
                   res.add(root.data);
                   if(root.left!=null)q.add(root.left);
                   root=root.right;
               }
           }
           return res;
      }
