   public String serialize(TreeNode root) {
        if (root == null)
            return "N";
        String data = Integer.toString(root.val);
        String left = serialize(root.left);
        String right = serialize(root.right);
        return data + "," + left + "," + right;
    }

    int idx = 0;

    public TreeNode deserialize(String[] data) {
        if (data[idx].equals("N")) {
            idx++;
            return null;
        }

        int val = Integer.parseInt(data[idx++]);
        TreeNode root = new TreeNode(val);

        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String str) {
        String[] data = str.split(",");
        return deserialize(data);
    }
