 static class Pair {
        int height = -1;
        int diameter = 0;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        Pair ans = new Pair();
        ans.height = Math.max(l.height, r.height) + 1;
        ans.diameter = Math.max(l.diameter, r.diameter);
        ans.diameter = Math.max(ans.diameter, l.height + r.height + 2);
        return ans;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Pair ans = dfs(root);
        return ans.diameter;
    }
