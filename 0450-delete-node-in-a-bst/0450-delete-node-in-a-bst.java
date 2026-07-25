class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val == key) {

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }
            TreeNode temp = root.right;

            while (temp.left != null) {
                temp = temp.left;
            }

            root.val = temp.val;

            root.right = deleteNode(root.right, temp.val);

            return root;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna