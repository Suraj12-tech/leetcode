/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int lt = findHeight(root.left);
        int rt = findHeight(root.right);

        int diff = Math.abs(lt - rt);

        if (diff > 1) {
            return false;
        } 

        boolean lft_node = isBalanced(root.left);
        boolean rht_node = isBalanced(root.right);

        if(!lft_node || !rht_node){
            return false;
        }

        return true;
    }

    public int findHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int lft = findHeight(node.left);
        int rht = findHeight(node.right);

        return 1 + Math.max(lft, rht);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna