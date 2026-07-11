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
    public int diameterOfBinaryTree(TreeNode root) {
        int depth[] = new int [1];
        check(root , depth);
        return depth[0];
    }

    public int check(TreeNode node , int depth[]) {
        if (node == null) {
            return 0;
        }

        int lft = check(node.left,depth);
        int rht = check(node.right,depth);

        depth[0] = Math.max(depth[0], lft + rht);

        return 1 + Math.max(lft, rht);
    }
}

